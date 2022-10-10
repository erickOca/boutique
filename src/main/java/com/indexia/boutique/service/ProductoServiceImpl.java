package com.indexia.boutique.service;

import com.indexia.boutique.model.dao.ProductoDao;
import com.indexia.boutique.model.entity.Productos;
import com.indexia.boutique.model.mapper.ProductMapper;
import com.indexia.boutique.util.request.ProductoRequest;
import com.indexia.boutique.util.response.ProductoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
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
    public ProductoResponse findById(int idProducto) {
        ProductoResponse response = productMapper.toDto(productoDao.findById(idProducto).orElse(null));
        return response;
    }

    @Override
    public List<ProductoResponse> findAll() {
        List<ProductoResponse> daoAll = productMapper.toDtoLis(productoDao.findAll());
        return daoAll;

    }

    @Override
    public void delete(int idProducto) {
        productoDao.deleteById(idProducto);
    }

    @Override
    public List<ProductoResponse> findByTalla(String talla) {
        List<ProductoResponse> productos = productMapper.toDtoLis(productoDao.findByTalla(talla));
        return productos;
    }

    @Override
    public List<ProductoResponse> findByGenero(String genero) {
        List<ProductoResponse> productos = productMapper.toDtoLis(productoDao.findByGenero(genero));
        return productos;
    }

    @Override
    public List<ProductoResponse> findByCategoria(String categoria) {
        List<ProductoResponse> productos = productMapper.toDtoLis(productoDao.findByCategoria(categoria));
        return productos;
    }

    @Override
    public ProductoResponse updateProduct(ProductoRequest request) {
        Productos productos  = new Productos();
        productos.setNombre(request.getNombre());
        productos.setDescripcion(request.getDescripcion());
        productos.setPrecio(request.getPrecio());
        productos.setMarca(request.getMarca());
        productos.setTalla(request.getTalla());
        productos.setColor(request.getColor());
        productos.setStock(request.getStock());
        productos.setCodigoBarras(request.getCodigoBarras());
        productos.setTemporada(request.getTemporada());
        productos.setGenero(request.getGenero());
        productos.setCategoria(request.getCategoria());
        ProductoResponse response = productMapper.toDto(productoDao.save(productos));
        return response ;
    }

    @Override
    public List<ProductoResponse> findAllByStock() {
        List<ProductoResponse> list = productMapper.toDtoLis(productoDao.findAllByStock());
        return list;
    }

    @Override
    public List<ProductoResponse> findByTemporada(String temporada) {
        List<ProductoResponse> list = productMapper.toDtoLis(productoDao.findByTemporada(temporada));
        return list;
    }

    private boolean validaStock(Productos productos){
        if (productos != null){
            if (productos.getStock() != 0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}

