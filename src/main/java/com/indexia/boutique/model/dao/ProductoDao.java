package com.indexia.boutique.model.dao;

import com.indexia.boutique.model.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDao extends JpaRepository<Productos, Integer> {



}
