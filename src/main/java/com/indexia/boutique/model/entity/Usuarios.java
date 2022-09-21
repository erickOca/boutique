package com.indexia.boutique.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "USUARIOS")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario", nullable = false, unique = true)
    private int idUsuario;

    @Column(name = "nombre", length = 80)
    private String nombre;

    @Column(name = "apellidos", length = 200)
    private String apellidos;

    @Column(name = "email", length = 80)
    private String email;

    @Column(name = "password", length = 80)
    private String password;


}
