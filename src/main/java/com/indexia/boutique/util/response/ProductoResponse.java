package com.indexia.boutique.util.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class ProductoResponse {

    private int idProducto;

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

    private String imagen;
}