package com.indexia.boutique.service;

import com.indexia.boutique.model.dao.ProductoDao;
import com.indexia.boutique.model.entity.Productos;
import com.indexia.boutique.model.mapper.ProductMapper;
import com.indexia.boutique.util.request.ProductoRequest;
import com.indexia.boutique.util.response.ProductoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public ProductoResponse save(ProductoRequest request) {
        Productos entityRequest = new Productos();
        entityRequest = productMapper.INSTANCE.toEntity(request);
        ProductoResponse producto = productMapper.toDto(productoDao.save(entityRequest));
        return producto;
    }

    @Override
    public Productos findById(int idProducto) {
        return productoDao.findById(idProducto).orElse(null);
    }

    @Override
    public List<Productos> findAll() {
        return productoDao.findAll();
    }

    @Override
    public void delete(int idProducto) {
        productoDao.deleteById(idProducto);
    }

    @Override
    public List<Productos> findByTalla(String talla) {
        List<Productos> productos = productoDao.findByTalla(talla);
        return productos;
    }

    @Override
    public List<Productos> findByGenero(String genero) {
        List<Productos> productos = productoDao.findByGenero(genero);
        return productos;
    }

    @Override
    public List<Productos> findByCategoria(String categoria) {
        List<Productos> productos = productoDao.findByCategoria(categoria);
        return productos;
    }

    @Override
    public Productos updateProduct(ProductoRequest request) {
        Productos productos  = new Productos();
        productos.setIdProducto(request.getId());
        productos.setNombre(request.getNombre());
        productos.setDescripcion(request.getDescripcion());
        productos.setPrecio(request.getPrecio());
        productos.setMarca(request.getMarca());
        productos.setTalla(request.getTalla());
        productos.setColor(request.getColor());
        productos.setStock(request.getStock());
        productos.setTemporada(request.getTemporada());
        productos.setGenero(request.getGenero());
        productos.setCategoria(request.getCategoria());
        return productoDao.save(productos);
    }
}

