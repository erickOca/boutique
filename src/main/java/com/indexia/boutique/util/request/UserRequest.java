package com.indexia.boutique.util.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

    private String nombre;

    private String apellidos;

    private String email;

    private String password;
}
