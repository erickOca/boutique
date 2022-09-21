package com.indexia.boutique.service;

import com.indexia.boutique.util.request.DetallesOrdenRequest;
import com.indexia.boutique.util.response.DetallesOrdenResponse;

import java.util.List;

public interface DetallesOrdenService {

    DetallesOrdenResponse saveDetallesOrde(DetallesOrdenRequest request);

    DetallesOrdenResponse updateDetallesOrde(DetallesOrdenRequest request, int idDetallesOrden);

    void deleteDetallesOrde(int id);

    List<DetallesOrdenResponse> findByNDeCarro(int nDeCarro);
}
