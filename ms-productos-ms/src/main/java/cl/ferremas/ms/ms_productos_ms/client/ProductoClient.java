package cl.ferremas.ms.ms_productos_ms.client;

import cl.ferremas.ms.ms_productos_ms.dto.ProductoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "ms-productos-db", url = "http://localhost:8080")
public interface ProductoClient {

    @GetMapping("/productos")
    List<ProductoDto> getAllProductos();

    @GetMapping("/productos/{id}")
    ProductoDto getProductoById(@PathVariable("id") Integer id);

    @PostMapping("/productos")
    ProductoDto createProducto(@RequestBody ProductoDto producto);

    @PutMapping("/productos/{id}")
    ProductoDto updateProducto(@PathVariable("id") Integer id, @RequestBody ProductoDto producto);

    @DeleteMapping("/productos/{id}")
    void deleteProducto(@PathVariable("id") Integer id);
}
