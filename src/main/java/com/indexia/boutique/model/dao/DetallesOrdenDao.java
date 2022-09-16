package com.indexia.boutique.model.dao;

import com.indexia.boutique.model.entity.DetallesOrden;
import com.indexia.boutique.model.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetallesOrdenDao extends JpaRepository<DetallesOrden, Integer> {

    @Query(value = "SELECT * FROM detalles_orden WHERE nde_carro = ?", nativeQuery = true)
    List<DetallesOrden> findByNDeCarro(int NDeCarro);
}
