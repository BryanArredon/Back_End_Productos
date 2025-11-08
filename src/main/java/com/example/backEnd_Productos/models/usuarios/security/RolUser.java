package com.example.backEnd_Productos.models.usuarios.security;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "rol_user")
public class RolUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_rol;

    @Column(name = "nombre_rol", nullable = true)
    private String nombreRol;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

}
