
package com.indexia.boutique.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "envios")
public class Envios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEnvios", nullable = false, unique = true)
    private int idEnvio;

    @Column(name = "estatusEnvio")
    private Boolean estatusEnvio;

    @JoinColumn(name = "idOrden")
    @OneToOne(fetch = FetchType.LAZY)
    private Orden orden;


}
