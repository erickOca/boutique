package com.indexia.boutique.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "DetallesUsuario")
public class DetallesUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente", nullable = false, unique = true)
    private int idCliente;

    @Column(name = "direccion", length = 200)
    private String direccion;

    @Column(name = "sexo", length = 45)
    private String sexo;

    @Column(name = "fecha_nac")
    private Date fechaNac;

    @Column(name = "estatus")
    private Boolean estatus;

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

    @JsonIgnoreProperties
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idUsuario")
    private Users users;

    public DetallesUsuario() {
    }

    public DetallesUsuario(int idCliente, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String sexo, Date fechaNac, Boolean estatus, String email, String numeroInterior, String numeroExterior, String calle, String colonia, String estado, String ciudad, String pais) {
        this.idCliente = idCliente;
        this.direccion = direccion;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.estatus = estatus;
        this.numeroInterior = numeroInterior;
        this.numeroExterior = numeroExterior;
        this.calle = calle;
        this.colonia = colonia;
        this.estado = estado;
        this.ciudad = ciudad;
        this.pais = pais;
    }
}
