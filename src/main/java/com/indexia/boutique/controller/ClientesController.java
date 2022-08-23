package com.indexia.boutique.controller;

import com.indexia.boutique.service.ClientesService;
import com.indexia.boutique.util.request.ClienteRequest;
import com.indexia.boutique.util.response.ClienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @PostMapping("/saveClient")
    public ClienteResponse saveClient(@RequestBody ClienteRequest clienteRequest){
        ClienteResponse client = clientesService.saveClient(clienteRequest);
        return client;
    }
}
