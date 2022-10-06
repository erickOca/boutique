package com.indexia.boutique.security.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import java.util.Collection;

@Getter
@Setter
public class JwtDto {

    private String token;

    private  String bearer = "Bearer";

    private String nombreUsuario;

    private Collection<? extends GrantedAuthority> authorities;

    public JwtDto(String token,String nombreUsuario, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
        this.authorities = authorities;
    }

}
