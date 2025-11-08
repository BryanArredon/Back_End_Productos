package com.example.backEnd_Productos.models.sucursales;

import com.example.backEnd_Productos.models.ventas.Ventas;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ventas_cajas")
public class VentasCajas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_venta_caja;

    @ManyToOne
    @JoinColumn(name = "caja_id", nullable = false)
    private Cajas caja;

    @OneToOne
    @JoinColumn(name = "venta_id", nullable = false)
    private Ventas venta;

    @Column(name = "fecha_registro", nullable = false)
    private LocalDate fechaRegistro;

    @Column(name = "monto_total", nullable = false)
    private Double montoTotal;
}
