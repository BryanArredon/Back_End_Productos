package com.example.backEnd_Productos.models.ventas;

import com.example.backEnd_Productos.models.compras.Compras;
import com.example.backEnd_Productos.models.compras.DetalleCompra;
import com.example.backEnd_Productos.models.productos.Productos;
import com.example.backEnd_Productos.models.sucursales.Cajas;
import com.example.backEnd_Productos.models.sucursales.Sucursales;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ventas")
public class Ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = true)
    private Productos productos;

    @Column(name = "fecha_venta", nullable = true)
    private LocalDate fechaVenta;

    @Column(name = "hora_venta", nullable = true)
    private LocalTime horaVenta;

    @ManyToOne
    @JoinColumn(name = "id_sucursal",nullable = true)
    private Sucursales sucursales;

    @ManyToOne
    @JoinColumn(name = "id_compra", nullable = true)
    private Compras compras;

    @ManyToOne
    @JoinColumn(name = "id_detalle_compra",nullable = true)
    private DetalleCompra detalleCompra;

    @ManyToOne
    @JoinColumn(name = "id_caja_sucursal", nullable = true)
    private Cajas cajas;

}
