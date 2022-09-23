package com.indexia.boutique.service;

import com.indexia.boutique.model.dao.UsersDao;
import com.indexia.boutique.model.entity.Users;
import com.indexia.boutique.model.mapper.UserMapper;
import com.indexia.boutique.util.request.UserRequest;
import com.indexia.boutique.util.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UsersDao usersDao;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserResponse saveUser(UserRequest request) {
        UserResponse userResponse = new UserResponse();
        Users entityRequest = new Users();
        entityRequest = userMapper.INSTANCE.toEntity(request);
        Users userExis = usersDao.findByEmail(request.getEmail());
        if (userExis instanceof Users) {
            System.out.println("User exist " + userExis);
            userResponse.setIdUsuario(userExis.getIdUsuario());
            userResponse.setNombre(userExis.getNombre());
            userResponse.setApellidos(userExis.getApellidos());
            userResponse.setEmail(userExis.getEmail());
            userResponse.setPassword("********");
            userResponse.setRespuesta("Ya existe un usuario con ese email");
            return userResponse;
        }else {
            UserResponse user = userMapper.toDto(usersDao.save(entityRequest));
            user.setRespuesta("NUEVO USUARIO CREADO");
            return user;
        }
    }

    @Override
    public UserResponse findByEmail(String email) {
       UserResponse response = userMapper.toDto(usersDao.findByEmail(email));
       return response;
    }

    @Override
    public List<UserResponse> findAll() {
        List<UserResponse> response = userMapper.toDtoLis(usersDao.findAll());
        return response;
    }

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
            response.setApellidos(user.getApellidos());
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
