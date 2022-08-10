package com.indexia.boutique.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "compras")
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCompras")
    private int idCompra;

    @Column(name = "fechaCompra")
    private String fechaCompra;

    @Column(name = "medioPago")
    private char medioPago;

    @Column(name = "comentario")
    private String comentario;

    @Column(name = "estatusCompra")
    private Boolean estatusCompra;

    @Column(name = "subTotal")
    private float subTotal;

    @JoinColumn(name = "idCliente")
    @OneToOne(fetch = FetchType.LAZY)
    private Clientes clientes;

}
