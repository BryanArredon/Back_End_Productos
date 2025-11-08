package com.example.backEnd_Productos.models.productos;

import java.util.List;

import com.example.backEnd_Productos.models.compras.DetalleCompra;
import com.example.backEnd_Productos.models.compras.Proveedores;
import com.example.backEnd_Productos.models.inventario.DetalleInventario;
import com.example.backEnd_Productos.models.inventario.MovimientosSucursal;
import com.example.backEnd_Productos.models.inventario.Pedidos;
import com.example.backEnd_Productos.models.ventas.Ventas;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_producto;

    @Column(name = "nombre_producto", nullable = false)
    private String nombreProducto;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private CategoriasProducto categoriaProducto;

    @ManyToOne
    @JoinColumn(name = "proveedor_id", nullable = false)
    private Proveedores proveedores;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<Lotes> lotes;

    @ManyToOne
    @JoinColumn(name = "descuento_id", nullable = true)
    private Descuentos descuentos;

    @ManyToOne
    @JoinColumn(name = "unidades_medida_id", nullable = false)
    private UnidadesMedida unidadesMedida;

    @OneToMany(mappedBy = "productos", cascade = CascadeType.ALL)
    private List<Ventas> ventas;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<DetalleCompra> detallesCompra;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<DetalleInventario> detallesInventario;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<Pedidos> pedidos;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<MovimientosSucursal> movimientosSucursal;

}
