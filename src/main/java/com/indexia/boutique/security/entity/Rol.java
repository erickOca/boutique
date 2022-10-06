package com.indexia.boutique.security.entity;

import com.indexia.boutique.security.enums.RolNombre;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;

    public Rol() {
    }

    public Rol(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

    public Rol(int id, RolNombre rolNombre) {
        this.id = id;
        this.rolNombre = rolNombre;
    }
}
