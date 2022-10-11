package com.indexia.boutique.service;

import com.indexia.boutique.util.request.ProductoRequest;
import com.indexia.boutique.util.response.ProductoResponse;

import java.util.List;

public interface ProductoService {

    ProductoResponse save(ProductoRequest request);

    ProductoResponse findById(int idProducto);

    List<ProductoResponse> findAll();

    void delete(int idProducto);

    List<ProductoResponse> findByTalla(String talla);

    List<ProductoResponse> findByGenero(String genero);

    List<ProductoResponse> findByCategoria(String categoria);

    List<ProductoResponse> findAllByStock();

    List<ProductoResponse> findByTemporada(String temporada);
}

