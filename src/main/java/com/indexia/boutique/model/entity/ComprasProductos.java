package com.indexia.boutique.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "comprasProductos")
public class ComprasProductos {

    @EmbeddedId
    private ComprasProductosPK id;

    @Column(name = "total")
    private int total;

    @Column(name = "estatus")
    private Boolean estatus;

}
