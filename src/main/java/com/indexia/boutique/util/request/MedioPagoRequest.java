package com.indexia.boutique.util.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedioPagoRequest {

    private String formaDePago;

    private boolean estatusMedioPago;
}
