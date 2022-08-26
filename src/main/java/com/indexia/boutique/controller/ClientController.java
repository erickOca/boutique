package com.indexia.boutique.controller;

import com.indexia.boutique.model.entity.Clientes;
import com.indexia.boutique.service.ClientesService;
import com.indexia.boutique.util.request.ClienteRequest;
import com.indexia.boutique.util.response.ClienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientesService clientesService;

    @PostMapping("/saveClient")
    public ClienteResponse saveClient(@RequestBody ClienteRequest clienteRequest){
        ClienteResponse client = clientesService.saveClient(clienteRequest);
        return client;
    }

    @GetMapping("/findAllClient")
    public ResponseEntity<List<Clientes>> listClient(){
        return new ResponseEntity<>(clientesService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/getClientById/{idCliente}")
    public ResponseEntity<Clientes> findById(@PathVariable int idCliente){
        clientesService.findById(idCliente);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/deleteClient/{idCliente}")
    public ResponseEntity deleteClient(@PathVariable int idCliente){
        clientesService.delete(idCliente);
        return new ResponseEntity<>(HttpStatus.OK);
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
