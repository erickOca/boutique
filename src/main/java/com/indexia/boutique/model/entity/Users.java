package com.indexia.boutique.model.entity;

import lombok.*;
import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "USUARIOS")
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario", nullable = false, unique = true)
    private int idUsuario;

    @Column(name = "nombreUsuario")
    private String nombreUsuario;

    @Column(name = "email", nullable = false,  length = 80)
    private String email;

    @Column(name = "password", length = 80)
    private String password;

}
