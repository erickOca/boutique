package com.indexia.boutique.service;

import com.indexia.boutique.util.request.CompraRequest;
import com.indexia.boutique.util.response.CompraResponse;

public interface CompraService {
    CompraResponse saveCompra(CompraRequest request);

}
