package com.indexia.boutique.controller;

import com.indexia.boutique.service.DetallesUserService;
import com.indexia.boutique.util.request.DetallesUserRequest;
import com.indexia.boutique.util.response.DetallesUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/DetallesClient")
public class DetallesClientController {

    @Autowired
    private DetallesUserService detallesUserService;

    @PostMapping("/saveClient")
    public ResponseEntity<?> saveClient(@RequestBody DetallesUserRequest clienteRequest){
        try {
            DetallesUserResponse client = detallesUserService.saveClient(clienteRequest);
            return ResponseEntity.status(HttpStatus.OK).body(client);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }
    }

    @GetMapping("/findAllClient")
    public ResponseEntity<?> listClient(){
        try {
            List<DetallesUserResponse> clientes = detallesUserService.findAll();
            return  ResponseEntity.status(HttpStatus.OK).body(clientes);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e);
        }
    }

    @GetMapping("/getClientById/{idCliente}")
    public ResponseEntity<?> findById(@PathVariable int idCliente){
        try {
            DetallesUserResponse cliente = detallesUserService.findById(idCliente);
            return ResponseEntity.status(HttpStatus.OK).body(cliente);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e);
        }
    }

    @DeleteMapping("/deleteClient/{idCliente}")
    public ResponseEntity<?> deleteClient(@PathVariable int idCliente){
        try {
            detallesUserService.delete(idCliente);
            return  ResponseEntity.status(HttpStatus.OK).body(Boolean.TRUE);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Boolean.FALSE);
        }
    }

    @PutMapping("/updateCliente")
    public ResponseEntity<?> updateCliente(@RequestBody DetallesUserRequest request){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(detallesUserService.updateClient(request));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
}