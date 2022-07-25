package com.erick.boutique.model.dao;

import com.erick.boutique.model.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosDao extends JpaRepository<Usuarios,Integer> {
}
