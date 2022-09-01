package com.indexia.boutique.service;

import com.indexia.boutique.util.request.ComprasRequest;
import com.indexia.boutique.util.response.ComprasResponse;

import java.util.List;

public interface ComprasService {

    ComprasResponse saveCompra(ComprasRequest request);

    List<ComprasResponse> findAll();

    ComprasResponse findById(int idCompra);

    void delete(int idCompra);

    ComprasResponse updateCompra(int idCompras);

}
