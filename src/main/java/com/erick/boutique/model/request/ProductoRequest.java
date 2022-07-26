package com.erick.boutique.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoRequest {

    private String nombre;

    private String marca;

    private int stock;

    private String codigoBarras;

    private int precio;

    private String categoria;

    private String talla;

    private String genero;
}
