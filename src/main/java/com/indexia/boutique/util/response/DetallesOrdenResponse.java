package com.indexia.boutique.util.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetallesOrdenResponse {

    private float importe;

    private int unidades;

    private ProductoResponse producto;
}
