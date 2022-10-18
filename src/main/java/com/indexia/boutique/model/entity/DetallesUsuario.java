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
    @Column(name = "idDetUsuario", nullable = false, unique = true)
    private int idDetUsuario;
    @Column(name = "nombre", length = 80)
    private String nombre;

    @Column(name = "apellidos", length = 80)
    private String apellidos;

    @Column(name = "direccion", length = 200)
    private String direccion;

    @Column(name = "sexo", length = 45)
    private String sexo;

    @Column(name = "fecha_nac")
    private Date fechaNac;

    @Column(name = "estatus")
    private Boolean estatus;

    @Column(name = "ciudad", length = 45)
    private String ciudad;


    @JsonIgnoreProperties
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Users idUsuario;

    public DetallesUsuario() {
    }

    public DetallesUsuario(int idDetUsuario, String nombre, String apellidos, String direccion, String sexo, Date fechaNac, Boolean estatus, String ciudad, Users idUsuario) {
        this.idDetUsuario = idDetUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.estatus = estatus;
        this.ciudad = ciudad;
        this.idUsuario = idUsuario;
    }
}
