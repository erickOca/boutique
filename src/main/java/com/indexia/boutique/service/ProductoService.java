package com.indexia.boutique.service;

import com.indexia.boutique.model.entity.Productos;
import com.indexia.boutique.util.request.ProductoRequest;
import com.indexia.boutique.util.response.ProductoResponse;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    ProductoResponse save(ProductoRequest request);

    Productos findById(int idProducto);

    List<Productos> findAll();

    void delete(int idProducto);

    List<Productos> findByTalla(String talla);

    List<Productos> findByGenero(String genero);

    List<Productos> findByCategoria(String categoria);

    public Productos updateProduct(ProductoRequest request);
}

