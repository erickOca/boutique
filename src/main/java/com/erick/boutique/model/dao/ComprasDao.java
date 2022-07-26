package com.erick.boutique.model.dao;

import com.erick.boutique.model.entity.Compras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprasDao extends JpaRepository<Compras, Integer> {
}
