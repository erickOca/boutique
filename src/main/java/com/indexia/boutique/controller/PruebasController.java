package com.indexia.boutique.controller;

import com.indexia.boutique.service.PruebasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pruevas")
public class PruebasController {

    @Autowired
    PruebasService pruevasService;

    @PostMapping("/saveTodosLosEntitys")
    public ResponseEntity<?> saveTodosLosEntitys(){
        try {
            pruevasService.inserTotal1();
            return ResponseEntity.status(HttpStatus.OK).body(Boolean.TRUE);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }
    }

}
