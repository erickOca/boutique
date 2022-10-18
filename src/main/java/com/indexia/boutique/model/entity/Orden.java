package com.indexia.boutique.model.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
@Entity
@Table(name = "orden")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Orden", nullable = false, unique = true)
    private int idOrden;

    @Column(name = "comentario", length = 200)
    private String comentario;

    @Column(name = "estatus_orden")
    private boolean estatusOrden;

    @Column(name = "fechaCompra")
    private Date fechaCompra;

    @Column(name = "total")
    private float total;

   @JoinColumn(name = "idDetUsuario")
    @ManyToOne(fetch = FetchType.LAZY)
    private DetallesUsuario detallesUsuario;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Productos> listproductos;

}
