package com.example.backEnd_Productos.models.sucursales;

import com.example.backEnd_Productos.models.compras.Compras;
import com.example.backEnd_Productos.models.finanzas.Egresos;
import com.example.backEnd_Productos.models.finanzas.Ingresos;
import com.example.backEnd_Productos.models.finanzas.Inversiones;
import com.example.backEnd_Productos.models.inventario.DetalleInventario;
import com.example.backEnd_Productos.models.inventario.MovimientosSucursal;
import com.example.backEnd_Productos.models.inventario.Pedidos;
import com.example.backEnd_Productos.models.ventas.Ventas;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sucursales")
public class Sucursales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_sucursal;

    @Column(name = "nombre_sucursal", nullable = false)
    private String nombreSucursal;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "telefono", nullable = true)
    private String telefono;

    @Column(name = "ciudad", nullable = true)
    private String ciudad;

    @Column(name = "estado", nullable = true)
    private String estado;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    private List<Empleados> empleados;

    @OneToMany(mappedBy = "sucursales", cascade = CascadeType.ALL)
    private List<Cajas> cajas;

    @OneToMany(mappedBy = "sucursales", cascade = CascadeType.ALL)
    private List<Ventas> ventas;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    private List<Compras> compras;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    private List<DetalleInventario> detallesInventario;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    private List<Pedidos> pedidos;

    @OneToMany(mappedBy = "sucursalOrigen", cascade = CascadeType.ALL)
    private List<MovimientosSucursal> movimientosOrigen;

    @OneToMany(mappedBy = "sucursalDestino", cascade = CascadeType.ALL)
    private List<MovimientosSucursal> movimientosDestino;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    private List<DetalleSucursal> detallesSucursal;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    private List<Ingresos> ingresos;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    private List<Egresos> egresos;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    private List<Inversiones> inversiones;
}
