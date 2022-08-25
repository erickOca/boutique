package com.indexia.boutique.util.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoResponse {

    private String nombre;

    private String descripcion;

    private float precio;

    private String marca;

    private String talla;

    private String color;

    private int stock;

    private String codigoBarras;

    private String temporada;

    private String genero;

    private String categoria;
}