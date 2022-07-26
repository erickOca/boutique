package com.erick.boutique.service;

import com.erick.boutique.model.dao.ProductoDao;
import com.erick.boutique.model.entity.Producto;
import com.erick.boutique.model.mapper.ProductMapper;
import com.erick.boutique.model.request.ProductoRequest;
import com.erick.boutique.model.response.ProductoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoDao productoDao;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public ProductoResponse save(ProductoRequest request) {
        Producto entityRequest = new Producto();
        entityRequest = productMapper.INSTANCE.toEntity(request);
        ProductoResponse producto = productMapper.toDto(productoDao.save(entityRequest));
        return producto;
    }


    @Override
    public Producto findById(int idProducto) {
        return productoDao.findById(idProducto).orElse(null);
    }

    @Override
    public List<Producto> findAll() {
        return productoDao.findAll();
    }

    @Override
    public void delete(int idProducto) {
    productoDao.deleteById(idProducto);
    }


}
