package com.indexia.boutique.util.request;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class ComprasRequest {

private int id;

private String comentario;

private boolean estatus_compra;

private Date fecha_compra;

private char medio_pago;

private float sub_total;

private int idCliente;

    public ComprasRequest() {
    }

    public ComprasRequest(int id, String comentario, boolean estatus_compra, Date fecha_compra, char medio_pago, float sub_total, int idCliente) {
        this.id = id;
        this.comentario = comentario;
        this.estatus_compra = estatus_compra;
        this.fecha_compra = fecha_compra;
        this.medio_pago = medio_pago;
        this.sub_total = sub_total;
        this.idCliente = idCliente;
    }
}
