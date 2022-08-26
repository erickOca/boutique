package com.indexia.boutique.service;

import com.indexia.boutique.model.entity.Clientes;
import com.indexia.boutique.util.request.ClienteRequest;
import com.indexia.boutique.util.response.ClienteResponse;

import java.util.List;

public interface ClientesService {

    ClienteResponse saveClient(ClienteRequest request);

    List<ClienteResponse> findAll();

    ClienteResponse findById(int idCliente);

    void delete(int idCliente);

      ClienteResponse updateClient(ClienteRequest request);
}
