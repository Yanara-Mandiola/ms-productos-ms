package cl.ferremas.ms.ms_productos_ms.service;

import cl.ferremas.ms.ms_productos_ms.client.ProductoClient;
import cl.ferremas.ms.ms_productos_ms.dto.ProductoDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoClient productoClient;

    public ProductoService(ProductoClient productoClient) {
        this.productoClient = productoClient;
    }

    public List<ProductoDto> getAllProductos() {
        return productoClient.getAllProductos();
    }

    public ProductoDto getProductoById(Integer id) {
        return productoClient.getProductoById(id);
    }

    public ProductoDto createProducto(ProductoDto producto) {
        return productoClient.createProducto(producto);
    }

    public ProductoDto updateProducto(Integer id, ProductoDto producto) {
        return productoClient.updateProducto(id, producto);
    }

    public void deleteProducto(Integer id) {
        productoClient.deleteProducto(id);
    }
}
