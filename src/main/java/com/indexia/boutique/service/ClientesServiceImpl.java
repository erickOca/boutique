package com.indexia.boutique.service;

import com.indexia.boutique.model.dao.ClientesDao;
import com.indexia.boutique.model.entity.DetallesUsuario;
import com.indexia.boutique.model.mapper.ClientMapper;
import com.indexia.boutique.util.request.ClienteRequest;
import com.indexia.boutique.util.response.ClienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesServiceImpl implements ClientesService{

    @Autowired
    private ClientesDao clientesDao;

    @Autowired
    private ClientMapper clientMapper;

    @Override
    public ClienteResponse saveClient(ClienteRequest request) {
        DetallesUsuario entityDetallesUsuario = new DetallesUsuario();
        entityDetallesUsuario = clientMapper.INSTANCE.toMapperEntity(request);
        ClienteResponse client = clientMapper.toMapperDto(clientesDao.save(entityDetallesUsuario));
        return client;
    }

    @Override
    public List<ClienteResponse> findAll() {
        List<ClienteResponse> list = clientMapper.toMapperDtoLis(clientesDao.findAll());
        return list;
    }

    @Override
    public ClienteResponse findById(int idCliente) {
        ClienteResponse response = clientMapper.toMapperDto(clientesDao.findById(idCliente).orElse(null));
        return response;
    }

    @Override
    public void delete(int idCliente) {
        clientesDao.deleteById(idCliente);
    }

    @Override
    public ClienteResponse updateClient(ClienteRequest request) {
        DetallesUsuario cliente =new DetallesUsuario(
                request.getId(),
                request.getNombre(),
                request.getApellidoPaterno(),
                request.getApellidoMaterno(),
                request.getDireccion(),
                request.getSexo(),
                request.getFechaNac(),
                request.getEstatus(),
                request.getEmail(),
                request.getNumeroInterior(),
                request.getNumeroExterior(),
                request.getCalle(),
                request.getColonia(),
                request.getEstado(),
                request.getCiudad(),
                request.getPais()
        );
        DetallesUsuario entityDetallesUsuario = new DetallesUsuario();
        ClienteResponse response = clientMapper.toMapperDto(clientesDao.save(cliente));
        return response;
    }
}
