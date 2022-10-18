package com.indexia.boutique.util.request;

import com.indexia.boutique.model.entity.Users;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DetallesUserRequest {

    private int id;

    private String nombre;

    private String apellidos;

    private String direccion;

    private String sexo;

    private Date fechaNac;

    private Boolean estatus;

    private String ciudad;

    private Users idUsuario;

}
