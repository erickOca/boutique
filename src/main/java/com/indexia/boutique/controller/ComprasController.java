package com.indexia.boutique.controller;

import com.indexia.boutique.service.ComprasService;
import com.indexia.boutique.util.request.ComprasRequest;
import com.indexia.boutique.util.response.ComprasResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class ComprasController {

    @Autowired
    ComprasService comprasService;

    @PostMapping("/saveCompras")
    public ResponseEntity<?> saveCompras(@RequestBody ComprasRequest request){
        try {
            ComprasResponse comprasResponse = comprasService.saveCompra(request);
            return ResponseEntity.status(HttpStatus.OK).body(comprasResponse);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }
    }
    @GetMapping("/findAllCompras")
    public ResponseEntity<?> listaCompras(){
        try {
            List<ComprasResponse> list = comprasService.findAll();
            return ResponseEntity.status(HttpStatus.OK).body(list);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e);
        }
    }
}
