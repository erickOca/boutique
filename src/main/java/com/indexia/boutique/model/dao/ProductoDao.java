package com.indexia.boutique.model.dao;

import com.indexia.boutique.model.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ProductoDao extends JpaRepository<Productos, Integer> {

    List<Productos> findByTalla(String talla);

    List<Productos> findByGenero(String genero);

    List<Productos> findByCategoria(String categoria);

}
