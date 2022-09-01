package com.indexia.boutique.util.response;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;


@Getter
@Setter
public class ComprasResponse {

    private int id;

    private String comentario;

    private boolean estatusCompra;

    private Date fecha_compra;

    private String medio_pago;

    private float sub_total;

    private int idCliente;

    public ComprasResponse() {
    }

    public ComprasResponse(int id, String comentario, boolean estatusCompra, Date fecha_compra, String medio_pago, float sub_total, int idCliente) {
        this.id = id;
        this.comentario = comentario;
        this.estatusCompra = estatusCompra;
        this.fecha_compra = fecha_compra;
        this.medio_pago = medio_pago;
        this.sub_total = sub_total;
        this.idCliente = idCliente;
    }
}
