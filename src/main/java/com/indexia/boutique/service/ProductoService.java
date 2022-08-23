package com.indexia.boutique.service;

import com.indexia.boutique.model.entity.Productos;
import com.indexia.boutique.util.request.ProductoRequest;
import com.indexia.boutique.util.response.ProductoResponse;

import java.util.List;

public interface ProductoService {

    ProductoResponse save(ProductoRequest request);

    Productos findById(int idProducto);

    List<Productos> findAll();

    void delete(int idProducto);



}

