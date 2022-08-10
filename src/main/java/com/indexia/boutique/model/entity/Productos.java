package com.indexia.boutique.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto")
    private int idProducto;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private float precio;

    @Column(name = "marca")
    private String marca;

    @Column(name = "talla")
    private String talla;

    @Column(name = "color")
    private String color;

    @Column(name = "stock")
    private int stock;

    @Column(name = "codigoBarras")
    private String codigoBarras;

    @Column(name = "temporada")
    private String temporada;

    @Column(name = "genero")
    private String genero;
}

