package com.indexia.boutique.service;

import com.indexia.boutique.model.dao.ComprasDao;
import com.indexia.boutique.model.entity.Compras;
import com.indexia.boutique.model.mapper.ComprasMapper;
import com.indexia.boutique.util.request.ComprasRequest;
import com.indexia.boutique.util.response.ComprasResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ComprasServiceImpl implements ComprasService{

    @Autowired
    ComprasDao comprasDao;

    @Autowired
    ComprasMapper comprasMapper;

    @Override
    public ComprasResponse saveCompra(ComprasRequest request) {
        Compras entity = new Compras();
        entity = comprasMapper.INSTANCE.toMapperEntity(request);
        ComprasResponse response = comprasMapper.toMapperDto(comprasDao.save(entity));
        return response;
    }

    @Override
    public List<ComprasResponse> findAll() {
        List<ComprasResponse> list = comprasMapper.toMapperDtoLis(comprasDao.findAll());
        return list;
    }

    @Override
    public ComprasResponse findById(int idCompra) {
        return null;
    }

    @Override
    public void delete(int idCompra) {

    }

    @Override
    public ComprasResponse updateCompra(int idCompras) {
        return null;
    }
}
