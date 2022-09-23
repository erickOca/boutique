package com.indexia.boutique.util.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {

    private int idUsuario;

    private String nombre;

    private String apellidos;

    private String email;

    private String password;

    private String respuesta;
}
