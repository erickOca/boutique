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
    @Column(name = "idCliente", nullable = false, unique = true)
    private int idCliente;

    @Column (name = "nombre", length = 80)
    private String nombre;

    @Column(name = "apellidoPaterno", length = 80)
    private String apellidoPaterno;

    @Column(name = "apellidoMaterno", length = 45)
    private String apellidoMaterno;

    @Column(name = "direccion", length = 200)
    private String direccion;

    @Column(name = "sexo", length = 45)
    private String sexo;

    @Column(name = "fecha_nac")
    private Date fechaNac;

    @Column(name = "estatus")
    private Boolean estatus;

    @Column(name = "email", length = 80)
    private String email;

    @Column(name = "numeroInterior", length = 45)
    private String numeroInterior;

    @Column(name = "numeroExterior", length = 45)
    private String numeroExterior;

    @Column(name = "calle", length = 45)
    private String calle;

    @Column(name = "colonia", length = 45)
    private String colonia;

    @Column(name = "estado", length = 45)
    private String estado;

    @Column(name = "ciudad", length = 45)
    private String ciudad;

    @Column(name = "pais", length = 45)
    private String pais;

    @OneToOne(mappedBy = "clientes",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    private Compras compras;


    @OneToOne(mappedBy = "clientesEnv",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    private Envios enviosCli;
}
