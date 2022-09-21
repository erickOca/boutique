package com.indexia.boutique.service;

import com.indexia.boutique.model.entity.MedioPago;
import com.indexia.boutique.util.request.MedioPagoRequest;
import com.indexia.boutique.util.response.MedioPagoResponse;

import java.util.List;

public interface MedioPagoService {

    MedioPagoResponse saveMedioPago(MedioPagoRequest request);

    List<MedioPagoResponse> findAll();

    void delete(int id);

    MedioPagoResponse findById(int id);

}
