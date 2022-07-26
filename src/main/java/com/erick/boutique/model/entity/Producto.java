package com.erick.boutique.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "PRODUCTO")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto")
    private int idProducto;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "marca")
    private String marca;

    @Column(name = "stock")
    private int stock;

    @Column(name = "codigoBarras")
    private String codigoBarras;

    @Column(name = "precio")
    private int precio;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "talla")
    private String talla;

    @Column(name = "genero")
    private String genero;

}

