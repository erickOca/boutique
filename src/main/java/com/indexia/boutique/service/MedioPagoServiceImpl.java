package com.indexia.boutique.service;

import com.indexia.boutique.model.dao.MedioPagoDao;
import com.indexia.boutique.model.entity.MedioPago;
import com.indexia.boutique.model.mapper.MedioPagoMapper;
import com.indexia.boutique.util.request.MedioPagoRequest;
import com.indexia.boutique.util.response.MedioPagoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedioPagoServiceImpl implements MedioPagoService{

    @Autowired
    MedioPagoMapper medioPagoMapper;

    @Autowired
    MedioPagoDao medioPagoDao;

    @Override
    public MedioPagoResponse saveMedioPago(MedioPagoRequest request) {
        MedioPago medioPago = new MedioPago();
        medioPago = medioPagoMapper.INSTANCE.toMapperEntity(request);
        MedioPagoResponse response = medioPagoMapper.toMapperDto(medioPagoDao.save(medioPago));
        return response;
    }

    @Override
    public List<MedioPagoResponse> findAll() {
        List<MedioPagoResponse> list = medioPagoMapper.toMapperDtoLis(medioPagoDao.findAll());
        return list;
    }

    @Override
    public void delete(int id) {
        medioPagoDao.deleteById(id);
    }

    @Override
    public MedioPagoResponse findById(int id) {
        MedioPagoResponse response = medioPagoMapper.toMapperDto(medioPagoDao.findById(id).orElse(null));
        return response;
    }

}
