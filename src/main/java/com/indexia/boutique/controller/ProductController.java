package com.indexia.boutique.controller;

import com.indexia.boutique.model.entity.Productos;
import com.indexia.boutique.service.ProductoService;
import com.indexia.boutique.util.request.ProductoRequest;
import com.indexia.boutique.util.response.ProductoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200" )
public class ProductController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/getAllProduct")
    public ResponseEntity<?> listaProducto() {
        try {
            return new ResponseEntity<>(productoService.findAll(), HttpStatus.OK);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<?> CrearProducto(@RequestBody ProductoRequest request) {
        try {
            ProductoResponse product = productoService.save(request);
            return ResponseEntity.status(HttpStatus.OK).body(product);
        }catch (Exception e){
          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Boolean.FALSE);
        }
    }

    @DeleteMapping("/delete/{idProducto}")
    public ResponseEntity delete(@PathVariable int idProducto) {
        try {
            productoService.delete(idProducto);
            return ResponseEntity.status(HttpStatus.OK).body(Boolean.TRUE);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Boolean.FALSE);
        }
    }

    @GetMapping("/getById/{idProducto}")
    public ResponseEntity<ProductoResponse> findById(@PathVariable int idProducto) {
        try {

            return ResponseEntity.status(HttpStatus.OK).body(productoService.findById(idProducto));
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getByTalla")
    public ResponseEntity<?> findAllByTalla(@RequestParam String talla) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productoService.findByTalla(talla));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/getByGenero")
    public ResponseEntity<?> findByGenero(@RequestParam String genero) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productoService.findByGenero(genero));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/getByCategoria")
    public ResponseEntity<?> findByCategoria(@RequestParam String categoria){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productoService.findByCategoria(categoria));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
    @PutMapping("/updateProducto")
    public ResponseEntity<?> updateProducto(@RequestBody ProductoRequest request){
        try {
            return  ResponseEntity.status(HttpStatus.OK).body(productoService.updateProduct(request));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @PutMapping("/getAllByStock")
    public ResponseEntity<?> getAllByStock(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productoService.findAllByStock());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @PutMapping("/getByTemporada")
    public ResponseEntity<?> getByTemporada(@RequestParam String temporada){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productoService.findByTemporada(temporada));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
}