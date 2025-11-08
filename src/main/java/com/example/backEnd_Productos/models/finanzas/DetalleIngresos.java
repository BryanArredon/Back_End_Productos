package com.example.backEnd_Productos.models.finanzas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detalle_ingresos")
public class DetalleIngresos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_detalle_ingreso;

    @ManyToOne
    @JoinColumn(name = "ingreso_id", nullable = false)
    private Ingresos ingreso;

    @Column(name = "descripcion", nullable = true)
    private String descripcion;

    @Column(name = "monto", nullable = false)
    private Double monto;

    @Column(name = "categoria", nullable = true)
    private String categoria;
}
