package com.indexia.boutique.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "detalles_orden")
public class DetallesOrden {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetalles_orden", nullable = false, unique = true)
    private int idDetallesOrden;

    @Column(name = "unidades")
    private int unidades;

    @Column(name = "importe")
    private float importe;

    @JoinColumn(name = "id_Producto")
    @ManyToOne(fetch = FetchType.LAZY)
    private Productos productos;

}
