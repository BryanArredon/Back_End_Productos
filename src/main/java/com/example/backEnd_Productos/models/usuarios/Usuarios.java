package com.example.backEnd_Productos.models.usuarios;


import com.example.backEnd_Productos.models.usuarios.security.RolUser;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "info_users")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = true)
    private RolUser rolUser;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "telefono-celular", nullable = false)
    private String telefonoCelular;

    @Column(name = "contraseña", nullable = false)
    private String contraseña;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "fecha-nacimiento", nullable = false)
    private String fechaNacimiento;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo", nullable = false)
    private Sexo sexo;

}
