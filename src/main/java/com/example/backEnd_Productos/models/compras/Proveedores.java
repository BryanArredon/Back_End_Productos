package com.example.backEnd_Productos.models.compras;

import com.example.backEnd_Productos.models.productos.Productos;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "proveedores")
public class Proveedores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_proveedor;

    @Column(name = "nombre_proveedor", nullable = false)
    private String nombreProveedor;

    @Column(name = "contacto", nullable = true)
    private String contacto;

    @Column(name = "telefono", nullable = true)
    private String telefono;

    @Column(name = "email", nullable = true)
    private String email;

    @Column(name = "direccion", nullable = true)
    private String direccion;

    @OneToMany(mappedBy = "proveedores", cascade = CascadeType.ALL)
    private List<Productos> productos;

    @OneToMany(mappedBy = "proveedor", cascade = CascadeType.ALL)
    private List<Compras> compras;
}
