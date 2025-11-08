package com.example.backEnd_Productos.models.productos;

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
@Table(name = "descuentos")
public class Descuentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_descuento;

    @Column(name = "nombre_descuento", nullable = false)
    private String nombreDescuento;

    @Column(name = "porcentaje", nullable = false)
    private Double porcentaje;

    @Column(name = "fecha_inicio", nullable = true)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin", nullable = true)
    private LocalDate fechaFin;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

    @OneToMany(mappedBy = "descuentos", cascade = CascadeType.ALL)
    private List<Productos> productos;
}
