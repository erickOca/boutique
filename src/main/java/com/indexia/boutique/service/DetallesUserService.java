package com.indexia.boutique.service;

import com.indexia.boutique.util.request.DetallesUserRequest;
import com.indexia.boutique.util.response.DetallesUserResponse;

import java.util.List;

public interface DetallesUserService {

    DetallesUserResponse saveClient(DetallesUserRequest request);

    List<DetallesUserResponse> findAll();

    DetallesUserResponse findById(int idCliente);

    void delete(int idCliente);

      DetallesUserResponse updateClient(DetallesUserRequest request);
}
