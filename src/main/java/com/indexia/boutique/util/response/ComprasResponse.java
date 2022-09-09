package com.indexia.boutique.util.response;

import com.indexia.boutique.util.request.ComprasRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class ComprasResponse {

    private int id;

    private Date fecha_compra;

    private int medio_pago;

    private String comentario;

    private boolean estatusCompra;

    private float sub_total;

    private int idCliente;

    public ComprasResponse() {
    }


    public void llenado(ComprasRequest request){
        setId(request.getId());
        setFecha_compra(request.getFecha_compra());
        setMedio_pago(request.getMedio_pago());
        setComentario(request.getComentario());
        setEstatusCompra(request.isEstatus_compra());
        setSub_total(request.getSub_total());
        setIdCliente(request.getIdCliente());
    }
}
