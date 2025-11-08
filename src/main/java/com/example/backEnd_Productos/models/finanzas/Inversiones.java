package com.example.backEnd_Productos.models.finanzas;

import com.example.backEnd_Productos.models.sucursales.Sucursales;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inversiones")
public class Inversiones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_inversion;

    @Column(name = "concepto", nullable = false)
    private String concepto;

    @Column(name = "monto_total", nullable = false)
    private Double montoTotal;

    @Column(name = "fecha_inversion", nullable = false)
    private LocalDate fechaInversion;

    @Column(name = "rendimiento_esperado", nullable = true)
    private Double rendimientoEsperado;

    @ManyToOne
    @JoinColumn(name = "sucursal_id", nullable = true)
    private Sucursales sucursal;

    @OneToMany(mappedBy = "inversion", cascade = CascadeType.ALL)
    private List<DetalleInversiones> detallesInversiones;
}
