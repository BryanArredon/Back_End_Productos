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
@Table(name = "unidades_medida")
public class UnidadesMedida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_unidad_medida;

    @Column(name = "nombre_unidad", nullable = false)
    private String nombreUnidad;

    @Column(name = "abreviatura", nullable = false)
    private String abreviatura;

    @Column(name = "descripcion", nullable = true)
    private String descripcion;

    @OneToMany(mappedBy = "unidadesMedida", cascade = CascadeType.ALL)
    private List<Productos> productos;
}
