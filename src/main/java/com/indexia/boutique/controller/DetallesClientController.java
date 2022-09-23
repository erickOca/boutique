package com.indexia.boutique.controller;

import com.indexia.boutique.service.ClientesService;
import com.indexia.boutique.util.request.ClienteRequest;
import com.indexia.boutique.util.response.ClienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/DetallesClient")
public class DetallesClientController {

    @Autowired
    private ClientesService clientesService;

    @PostMapping("/saveClient")
    public ResponseEntity<?> saveClient(@RequestBody ClienteRequest clienteRequest){
        try {
            ClienteResponse client = clientesService.saveClient(clienteRequest);
            return ResponseEntity.status(HttpStatus.OK).body(client);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }
    }

    @GetMapping("/findAllClient")
    public ResponseEntity<?> listClient(){
        try {
            List<ClienteResponse> clientes = clientesService.findAll();
            return  ResponseEntity.status(HttpStatus.OK).body(clientes);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e);
        }
    }

    @GetMapping("/getClientById/{idCliente}")
    public ResponseEntity<?> findById(@PathVariable int idCliente){
        try {
            ClienteResponse cliente = clientesService.findById(idCliente);
            return ResponseEntity.status(HttpStatus.OK).body(cliente);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e);
        }
    }

    @DeleteMapping("/deleteClient/{idCliente}")
    public ResponseEntity<?> deleteClient(@PathVariable int idCliente){
        try {
            clientesService.delete(idCliente);
            return  ResponseEntity.status(HttpStatus.OK).body(Boolean.TRUE);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Boolean.FALSE);
        }
    }

    @PutMapping("/updateCliente")
    public ResponseEntity<?> updateCliente(@RequestBody ClienteRequest request){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(clientesService.updateClient(request));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
}