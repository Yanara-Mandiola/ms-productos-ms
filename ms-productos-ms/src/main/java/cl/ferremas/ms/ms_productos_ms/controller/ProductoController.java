package cl.ferremas.ms.ms_productos_ms.controller;

import cl.ferremas.ms.ms_productos_ms.dto.ProductoDto;
import cl.ferremas.ms.ms_productos_ms.service.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<ProductoDto> getAllProductos() {
        return productoService.getAllProductos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoDto> getProductoById(@PathVariable Integer id) {
        ProductoDto producto = productoService.getProductoById(id);
        if (producto != null) {
            return ResponseEntity.ok(producto);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ProductoDto createProducto(@RequestBody ProductoDto producto) {
        return productoService.createProducto(producto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductoDto> updateProducto(@PathVariable Integer id, @RequestBody ProductoDto producto) {
        ProductoDto updated = productoService.updateProducto(id, producto);
        if (updated != null) {
            return ResponseEntity.ok(updated);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducto(@PathVariable Integer id) {
        productoService.deleteProducto(id);
        return ResponseEntity.noContent().build();
    }
}
