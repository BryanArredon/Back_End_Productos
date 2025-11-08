package com.example.backEnd_Productos.models.productos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categorias_producto")
public class CategoriasProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categoria;

    @Column(name = "nombre_categoria", nullable = false)
    private String nombreCategoria;

    @Column(name = "descripcion", nullable = true)
    private String descripcion;

    @OneToMany(mappedBy = "categoriaProducto", cascade = CascadeType.ALL)
    private List<Productos> productos;
}
