package com.indexia.boutique.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    private int idCliente;

    @Column (name = "nombre")
    private String nombre;

    @Column(name = "apellidoPaterno")
    private String apellidoPaterno;

    @Column(name = "apellidoMaterno")
    private String apellidoMaterno;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "fecha_nac")
    private Date fechaNac;

    @Column(name = "estatus")
    private Boolean estatus;

    @Column(name = "email")
    private String email;

    @Column(name = "numeroInterior")
    private String numeroInterior;

    @Column(name = "numeroExterior")
    private String numeroExterior;

    @Column(name = "calle")
    private String calle;

    @Column(name = "colonia")
    private String colonia;

    @Column(name = "estado")
    private String estado;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "pais")
    private String pais;

    @OneToOne(mappedBy = "clientes",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    private Compras compras;
}
