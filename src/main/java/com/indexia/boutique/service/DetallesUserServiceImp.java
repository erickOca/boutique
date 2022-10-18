package com.indexia.boutique.service;

import com.indexia.boutique.model.dao.DetallesUserDao;
import com.indexia.boutique.model.entity.DetallesUsuario;
import com.indexia.boutique.model.mapper.ClientMapper;
import com.indexia.boutique.util.request.DetallesUserRequest;
import com.indexia.boutique.util.response.DetallesUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallesUserServiceImp implements DetallesUserService {

    @Autowired
    private DetallesUserDao detallesUserDao;

    @Autowired
    private ClientMapper clientMapper;

    @Override
    public DetallesUserResponse saveClient(DetallesUserRequest request) {
        DetallesUsuario entityDetallesUsuario = new DetallesUsuario();
        entityDetallesUsuario = clientMapper.INSTANCE.toMapperEntity(request);
        DetallesUserResponse client = clientMapper.toMapperDto(detallesUserDao.save(entityDetallesUsuario));
        return client;
    }

    @Override
    public List<DetallesUserResponse> findAll() {
        List<DetallesUserResponse> list = clientMapper.toMapperDtoLis(detallesUserDao.findAll());
        return list;
    }

    @Override
    public DetallesUserResponse findById(int idCliente) {
        DetallesUserResponse response = clientMapper.toMapperDto(detallesUserDao.findById(idCliente).orElse(null));
        return response;
    }

    @Override
    public void delete(int idCliente) {
        detallesUserDao.deleteById(idCliente);
    }

    @Override
    public DetallesUserResponse updateClient(DetallesUserRequest request) {
        DetallesUsuario cliente =new DetallesUsuario(
                request.getId(),
                request.getNombre(),
                request.getApellidos(),
                request.getDireccion(),
                request.getSexo(),
                request.getFechaNac(),
                request.getEstatus(),
                request.getCiudad(),
                request.getIdUsuario()
        );
        DetallesUsuario entityDetallesUsuario = new DetallesUsuario();
        DetallesUserResponse response = clientMapper.toMapperDto(detallesUserDao.save(cliente));
        return response;
    }
}
