package com.indexia.boutique.util.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CompraRequest {

    private int idProducto;

    private int UnidadesProducto;

    private int idCliente;

    private int idMedioDePago;

    private Date fechaCompra;

    private String comentario;
}
