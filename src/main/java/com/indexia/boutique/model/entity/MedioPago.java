package com.indexia.boutique.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "medio_pago")
public class MedioPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMedio_pago")
    private int idMedioPago;

    @Column(name = "forma_de_pago")
    private String formaDePago;

    @Column(name = "estatus_medio_pago")
    private boolean estatusMedioPago;
}
