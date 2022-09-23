package com.indexia.boutique.model.dao;

import com.indexia.boutique.model.entity.DetallesUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesDao extends JpaRepository<DetallesUsuario,Integer> {
}
