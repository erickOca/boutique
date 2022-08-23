package com.indexia.boutique.service;

import com.indexia.boutique.util.request.ClienteRequest;
import com.indexia.boutique.util.response.ClienteResponse;

public interface ClientesService {

    ClienteResponse saveClient(ClienteRequest request);
}
