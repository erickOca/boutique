package com.indexia.boutique.controller;

import com.indexia.boutique.service.MedioPagoService;
import com.indexia.boutique.util.request.MedioPagoRequest;
import com.indexia.boutique.util.response.MedioPagoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medioPago")
public class MedioPagoController {

    @Autowired
    private MedioPagoService service;

    @PostMapping("/saveMedioPago")
    public ResponseEntity<?> saveMedioPago(@RequestBody MedioPagoRequest request){
    try {
        MedioPagoResponse response = service.saveMedioPago(request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }catch (Exception e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }
    }

    @GetMapping("/findAllMedioPago")
    public ResponseEntity<?> findAllMedioPago(){
        try {
            List<MedioPagoResponse> listResponse = service.findAll();
            return ResponseEntity.status(HttpStatus.OK).body(listResponse);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e);
        }
    }
    @DeleteMapping("/deleteMedioPago/{idMedioPago}")
    public ResponseEntity<?> delete(int id){
        try {
            service.delete(id);
            return  ResponseEntity.status(HttpStatus.OK).body(Boolean.TRUE);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Boolean.FALSE);
        }
    }



}
