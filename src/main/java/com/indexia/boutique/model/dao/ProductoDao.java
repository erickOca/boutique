package com.indexia.boutique.model.dao;

import com.indexia.boutique.model.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ProductoDao extends JpaRepository<Productos, Integer> {

    @Query(value = "SELECT * FROM productos WHERE talla = ? AND stock > 0", nativeQuery = true)
    List<Productos> findByTalla(String talla);

    @Query(value = "SELECT * FROM productos WHERE genero = ? AND stock > 0", nativeQuery = true)
    List<Productos> findByGenero(String genero);

    @Query(value = "SELECT * FROM productos WHERE categoria = ? AND stock > 0", nativeQuery = true)
    List<Productos> findByCategoria(String categoria);

    @Query(value = "SELECT * FROM productos WHERE stock > 0", nativeQuery = true)
    List<Productos> findAllByStock();

    @Query(value = "SELECT * FROM productos WHERE temporada = ? AND stock > 0", nativeQuery = true)
    List<Productos> findByTemporada(String temporada);

    @Query(value = "SELECT * FROM productos WHERE nombre = nombre AND stock > 0", nativeQuery = true)
    List<Productos> findByNombre(String nombre);
}
