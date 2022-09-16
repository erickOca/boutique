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
    @Column(name = "idProducto",nullable = false,unique = true)
    private int idProducto;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "descripcion", length = 200)
    private String descripcion;

    @Column(name = "precio")
    private float precio;

    @Column(name = "marca", length = 45)
    private String marca;

    @Column(name = "talla", length = 45)
    private String talla;

    @Column(name = "color", length = 80)
    private String color;

    @Column(name = "stock")
    private int stock;

    @Column(name = "codigoBarras", length = 80)
    private String codigoBarras;

    @Column(name = "temporada", length = 45)
    private String temporada;

    @Column(name = "genero", length = 45)
    private String genero;

    @Column(name = "categoria",length = 45)
    private String categoria;

    public Productos() {
    }

    public Productos(int idProducto, String nombre, String descripcion, float precio, String marca, String talla, String color, int stock, String codigoBarras, String temporada, String genero, String categoria) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
        this.stock = stock;
        this.codigoBarras = codigoBarras;
        this.temporada = temporada;
        this.genero = genero;
        this.categoria = categoria;
    }
}

