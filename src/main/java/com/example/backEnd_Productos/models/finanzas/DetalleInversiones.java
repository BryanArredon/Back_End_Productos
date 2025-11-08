package com.example.backEnd_Productos.models.finanzas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detalle_inversiones")
public class DetalleInversiones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_detalle_inversion;

    @ManyToOne
    @JoinColumn(name = "inversion_id", nullable = false)
    private Inversiones inversion;

    @Column(name = "descripcion", nullable = true)
    private String descripcion;

    @Column(name = "monto", nullable = false)
    private Double monto;

    @Column(name = "tipo_inversion", nullable = true)
    private String tipoInversion;
}
