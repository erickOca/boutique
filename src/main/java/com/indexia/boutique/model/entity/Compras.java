package com.indexia.boutique.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "compras")
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCompras", nullable = false, unique = true)
    private int idCompra;

    @Column(name = "fechaCompra")
    private Date fechaCompra;

    @Column(name = "medioPago")
    private String medioPago;

    @Column(name = "comentario", length = 200)
    private String comentario;

    @Column(name = "estatusCompra")
    private boolean estatusCompra;

    @Column(name = "subTotal")
    private float subTotal;

    @JoinColumn(name = "idCliente")
    @OneToOne(fetch = FetchType.LAZY)
    private Clientes clientes;

    @OneToOne(mappedBy = "compras",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    private ComprasProductos comprasProductos;

}
