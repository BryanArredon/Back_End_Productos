package com.example.backEnd_Productos.models.sucursales;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detalle_sucursal")
public class DetalleSucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_detalle_sucursal;

    @ManyToOne
    @JoinColumn(name = "sucursal_id", nullable = false)
    private Sucursales sucursal;

    @Column(name = "descripcion", nullable = true)
    private String descripcion;

    @Column(name = "horario_apertura", nullable = true)
    private String horarioApertura;

    @Column(name = "horario_cierre", nullable = true)
    private String horarioCierre;

    @Column(name = "area_m2", nullable = true)
    private Double areaM2;
}
