package com.indexia.boutique.service;

import com.indexia.boutique.util.request.UserRequest;
import com.indexia.boutique.util.response.UserResponse;

import java.util.List;

public interface UserService {


    void delete(String email);

    UserResponse validate(String email,String password);
}
