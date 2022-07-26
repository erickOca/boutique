package com.erick.boutique.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoResponse {

    private String nombre;

    private String marca;

    private int stock;

    private String codigoBarras;

    private int precio;

    private String categoria;

    private String  talla;

    private String genero;
}
