package com.indexia.boutique.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "envios")
public class Envios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEnvios")
    private int idEnvio;

    @Column(name = "estatusEnvio")
    private Boolean estatusEnvio;

    @OneToOne(mappedBy = "envios",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    private ComprasProductos comprasProductos;


}
