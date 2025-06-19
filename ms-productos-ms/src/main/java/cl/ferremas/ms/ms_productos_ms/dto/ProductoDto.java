package cl.ferremas.ms.ms_productos_ms.dto;

import java.math.BigDecimal;

public class ProductoDto {
    private Integer id;
    private String nombre;
    private String categoria;
    private BigDecimal precio;

    public ProductoDto() {}

    public ProductoDto(Integer id, String nombre, String categoria, BigDecimal precio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    // Getters y setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public BigDecimal getPrecio() { return precio; }
    public void setPrecio(BigDecimal precio) { this.precio = precio; }
}
