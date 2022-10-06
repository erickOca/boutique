package com.indexia.boutique.security.service;

import com.indexia.boutique.model.entity.Users;
import com.indexia.boutique.security.entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Users user = usuarioService.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(user);
    }
}
