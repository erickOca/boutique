package com.indexia.boutique.model.dao;

import com.indexia.boutique.model.entity.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComprasDao extends JpaRepository<Orden, Integer> {

}
