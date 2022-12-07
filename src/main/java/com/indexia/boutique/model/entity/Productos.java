package com.indexia.boutique.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto",nullable = false,unique = true)
    private int idProducto;

    @Column(name = "nombre",nullable = false , length = 50)
    private String nombre;

    @Column(name = "descripcion", nullable = false ,length = 200)
    private String descripcion;

    @Column(name = "precio", nullable = false)
    private float precio;

    @Column(name = "marca", nullable = false,  length = 45)
    private String marca;

    @Column(name = "talla", nullable = false, length = 45)
    private String talla;

    @Column(name = "color", nullable = false, length = 80)
    private String color;

    @Column(name = "stock", nullable = false)
    private int stock;

    @Column(name = "codigoBarras",nullable = false, length = 80)
    private String codigoBarras;

    @Column(name = "temporada", nullable = false,length = 45)
    private String temporada;

    @Column(name = "genero",nullable = false, length = 45)
    private String genero;

    @Column(name = "categoria",nullable = false,length = 45)
    private String categoria;

    @Column(name = "imagen",nullable = false,length = 200)
    private String imagen;

    public Productos() {
    }

    public Productos(int idProducto, String nombre, String descripcion, float precio, String marca, String talla, String color, int stock, String codigoBarras, String temporada, String genero, String categoria, String imagen) {
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
        this.imagen = imagen;
    }
}

