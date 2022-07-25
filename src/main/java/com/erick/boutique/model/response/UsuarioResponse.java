package com.erick.boutique.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponse {

    private String username;

    private String email;

    private String password;

    private String nombre;

    private String apellidoPaterno;

    private String apellidoMaterno;

    private String rol;

    private Boolean estatus;

    private String colonia;

    private String calle;

    private String ciudad;

    private String estado;
}
