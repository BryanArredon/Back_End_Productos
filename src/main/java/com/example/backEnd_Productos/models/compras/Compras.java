package com.example.backEnd_Productos.models.compras;

import com.example.backEnd_Productos.models.sucursales.Sucursales;
import com.example.backEnd_Productos.models.ventas.Ventas;
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
@Table(name = "compras")
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_compra;

    @Column(name = "fecha_compra", nullable = false)
    private LocalDate fechaCompra;

    @Column(name = "total", nullable = false)
    private Double total;

    @ManyToOne
    @JoinColumn(name = "proveedor_id", nullable = false)
    private Proveedores proveedor;

    @ManyToOne
    @JoinColumn(name = "sucursal_id", nullable = true)
    private Sucursales sucursal;

    @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL)
    private List<DetalleCompra> detallesCompra;

    @OneToMany(mappedBy = "compras", cascade = CascadeType.ALL)
    private List<Ventas> ventas;
}
