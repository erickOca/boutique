package com.indexia.boutique.model.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "orden")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCompras", nullable = false, unique = true)
    private int idCompra;

    @Column(name = "comentario", length = 200)
    private String comentario;

    @Column(name = "estatus_orden")
    private boolean estatusOrden;

    @Column(name = "fechaCompra")
    private Date fechaCompra;

    @Column(name = "total")
    private float total;

    @Column(name = "iva")
    private float iva;

   @JoinColumn(name = "id_Cliente")
    @ManyToOne(fetch = FetchType.LAZY)
    private Clientes clientes;

    @JoinColumn(name = "idMedio_pago")
    @ManyToOne(fetch = FetchType.LAZY)
    private MedioPago medioPago;

}
