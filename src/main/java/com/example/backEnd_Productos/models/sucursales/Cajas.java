package com.example.backEnd_Productos.models.sucursales;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "CajasSucursal")
public class Cajas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_caja_sucursal;

    @Column(name = "codigo_caja", nullable = false)
    private Integer codigo_caja;

    @ManyToOne
    @JoinColumn(name = "operadores_caja", nullable = false)
    private Empleados empleados;

    @ManyToOne
    @JoinColumn(name = "id_sucursal", nullable = false)
    private Sucursales sucursales;


}
