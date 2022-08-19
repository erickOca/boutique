package com.indexia.boutique.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "comprasProductos")
public class ComprasProductos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCompras_Productos", nullable = false, unique = true)
    private int idComprasProductos;

    @Column(name = "total")
    private int total;

    @Column(name = "estatus")
    private Boolean estatus;
/*
    @OneToMany(mappedBy = "comprasProductos",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    private Envios envios;
*/
    @JoinColumn(name = "idProducto")
    @ManyToOne(fetch = FetchType.LAZY)
    private Productos productosCom;

    @JoinColumn(name = "idCompras")
    @ManyToOne(fetch = FetchType.LAZY)
    private Compras compras;
}
