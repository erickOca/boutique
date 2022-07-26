package com.erick.boutique.controller;

import com.erick.boutique.model.entity.Producto;
import com.erick.boutique.model.request.ProductoRequest;
import com.erick.boutique.model.response.ProductoResponse;
import com.erick.boutique.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/getProducto")
    public ResponseEntity<List<Producto>> listaProducto() {
        return new ResponseEntity<>(productoService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ProductoResponse CrearProducto(@RequestBody ProductoRequest request) {
        ProductoResponse product = productoService.save(request);
        return product;
    }

    @DeleteMapping("/eliminar/{idProducto}")
    public ResponseEntity delete(@PathVariable int idProducto) {
        productoService.delete(idProducto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}