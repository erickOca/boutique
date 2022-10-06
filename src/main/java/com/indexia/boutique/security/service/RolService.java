package com.indexia.boutique.security.service;

import com.indexia.boutique.security.entity.Rol;
import com.indexia.boutique.security.enums.RolNombre;
import com.indexia.boutique.security.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    private RolRepository repository;

    public Optional<Rol> getByNombre(RolNombre rolNombre){
        return repository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        repository.save(rol);
    }
}
