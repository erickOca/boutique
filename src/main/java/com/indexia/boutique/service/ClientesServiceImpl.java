package com.indexia.boutique.service;

import com.indexia.boutique.model.dao.ClientesDao;
import com.indexia.boutique.model.entity.Clientes;
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
        Clientes entityClientes = new Clientes();
        entityClientes = clientMapper.INSTANCE.toMapperEntity(request);
        ClienteResponse client = clientMapper.toMapperDto(clientesDao.save(entityClientes));
        return client;
    }

    @Override
    public List<Clientes> findAll() {
        return clientesDao.findAll();
    }

    @Override
    public Clientes findById(int idCliente) {
        return clientesDao.findById(idCliente).orElse(null);
    }

    @Override
    public void delete(int idCliente) {
        clientesDao.deleteById(idCliente);
    }

    @Override
    public Clientes updateClient(ClienteRequest request) {
        Clientes cliente =new Clientes(
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
        return clientesDao.save(cliente);
    }
}
