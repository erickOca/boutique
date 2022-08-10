package com.indexia.boutique.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class ComprasProductosPK implements Serializable {

    @Column(name = "idCompras")
    private int idCompras;

    @Column(name = "idProductos")
    private int idProductos;
}