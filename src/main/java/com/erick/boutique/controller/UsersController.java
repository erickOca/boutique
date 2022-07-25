package com.erick.boutique.controller;

import com.erick.boutique.model.request.UsuarioRequest;
import com.erick.boutique.model.response.UsuarioResponse;
import com.erick.boutique.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsuariosService usuariosService;

    @PostMapping("/saveUsers")
    public UsuarioResponse saveUsers(@RequestBody UsuarioRequest request) {
        UsuarioResponse user = usuariosService.save(request);
        return user;
    }
}
