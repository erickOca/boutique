package com.indexia.boutique.util.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ClienteRequest {

    private String nombre;

    private String apellidoPaterno;

    private String apellidoMaterno;

    private String direccion;

    private String sexo;

    private Date fechaNac;

    private Boolean estatus;

    private String email;

    private String numeroInterior;

    private String numeroExterior;

    private String calle;

    private String colonia;

    private String estado;

    private String ciudad;

    private String pais;
}
