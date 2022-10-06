package com.indexia.boutique.service;

import com.indexia.boutique.model.dao.UsersDao;
import com.indexia.boutique.model.entity.Users;
import com.indexia.boutique.util.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UsersDao usersDao;




    @Override
    public void delete(String email) {
        usersDao.deleteByEmail(email);
    }

    @Override
    public UserResponse validate(String email, String password) {
        Users user = usersDao.validateUser(email,password);
        UserResponse response = new UserResponse();
        if (user instanceof Users){
            response.setIdUsuario(user.getIdUsuario());
            response.setNombre(user.getNombre());
            response.setEmail(user.getEmail());
            response.setPassword(user.getPassword());
            response.setRespuesta("Usuario encontrado");
            return response;
        }else {
            System.out.println("User no encontrado");
            return null;
        }
    }
}
