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
@Table(name = "egresos")
public class Egresos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_egreso;

    @Column(name = "concepto", nullable = false)
    private String concepto;

    @Column(name = "monto_total", nullable = false)
    private Double montoTotal;

    @Column(name = "fecha_egreso", nullable = false)
    private LocalDate fechaEgreso;

    @ManyToOne
    @JoinColumn(name = "sucursal_id", nullable = true)
    private Sucursales sucursal;

    @OneToMany(mappedBy = "egreso", cascade = CascadeType.ALL)
    private List<DetalleEgresos> detallesEgresos;
}
