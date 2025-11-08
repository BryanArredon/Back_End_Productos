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
@Table(name = "ingresos")
public class Ingresos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ingreso;

    @Column(name = "concepto", nullable = false)
    private String concepto;

    @Column(name = "monto_total", nullable = false)
    private Double montoTotal;

    @Column(name = "fecha_ingreso", nullable = false)
    private LocalDate fechaIngreso;

    @ManyToOne
    @JoinColumn(name = "sucursal_id", nullable = true)
    private Sucursales sucursal;

    @OneToMany(mappedBy = "ingreso", cascade = CascadeType.ALL)
    private List<DetalleIngresos> detallesIngresos;
}
