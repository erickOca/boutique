package com.indexia.boutique.controller;

import com.indexia.boutique.service.DetallesOrdenService;
import com.indexia.boutique.util.request.DetallesOrdenRequest;
import com.indexia.boutique.util.response.DetallesOrdenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/detallesOrden")
public class DetallesOrdenController {

    @Autowired
    DetallesOrdenService service;

    @PostMapping("/saveDetallesOrden")
    public ResponseEntity<?> saveDetallesOrden(@RequestBody DetallesOrdenRequest request){
        try {
            DetallesOrdenResponse response = service.saveDetallesOrde(request);
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }
    }

    @PutMapping("/updateDetallesOrden/{idDetallesOrden}")
    public ResponseEntity<?> updateDetallesOrde(@RequestBody DetallesOrdenRequest request, @PathVariable int idDetallesOrden){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.updateDetallesOrde(request, idDetallesOrden));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }
    }

    @DeleteMapping("/DeleteDetallesOrden/{idDetallesOrden}")
    public ResponseEntity<?> deleteDetallesOrde(int idDetallesOrden){
        try {
            service.deleteDetallesOrde(idDetallesOrden);
            return ResponseEntity.status(HttpStatus.OK).body(true);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(false);
        }
    }

    @GetMapping("/getDetallesOrden")
    public ResponseEntity<?> findByNdeCarro (@RequestParam int NDeCarro){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findByNDeCarro(NDeCarro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e);
        }
    }
}
