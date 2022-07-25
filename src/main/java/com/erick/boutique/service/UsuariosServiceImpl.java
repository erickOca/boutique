package com.erick.boutique.service;

import com.erick.boutique.model.dao.UsuariosDao;
import com.erick.boutique.model.entity.Usuarios;
import com.erick.boutique.model.mapper.UserMapper;
import com.erick.boutique.model.request.UsuarioRequest;
import com.erick.boutique.model.response.UsuarioResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceImpl implements UsuariosService {

    @Autowired
    private UsuariosDao usuariosDao;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UsuarioResponse save(UsuarioRequest request) {
        Usuarios entityRequest = new Usuarios();
        entityRequest = userMapper.toEntity(request);
        UsuarioResponse user = userMapper.toDto(usuariosDao.save(entityRequest));
        return user;
    }
}
