package com.erick.boutique.service;

import com.erick.boutique.model.entity.Producto;
import com.erick.boutique.model.request.ProductoRequest;
import com.erick.boutique.model.response.ProductoResponse;

import java.util.List;

public interface ProductoService {

    public ProductoResponse save(ProductoRequest request);

    public Producto findById(int idProducto);

    public List<Producto> findAll();

    public void delete(int idProducto);


}
