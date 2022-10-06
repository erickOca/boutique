package com.indexia.boutique.controller;

import com.indexia.boutique.service.UserService;
import com.indexia.boutique.util.request.UserRequest;
import com.indexia.boutique.util.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;


    @DeleteMapping("/deleteUser/{email}")
    public ResponseEntity<?> deleteUser(@PathVariable String email){
        userService.delete(email);
           return ResponseEntity.status(HttpStatus.OK).body(Boolean.TRUE);
    }

    @PostMapping(value = "/login")
    @Validated(UserResponse.class)
    public ResponseEntity<?> login(@RequestParam @Valid String email, String password){
       UserResponse user = userService.validate(email,password);
       if (user == null){
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
       }else {
           return ResponseEntity.status(HttpStatus.OK).body(user);
       }
    }

}
