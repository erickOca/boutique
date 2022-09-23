package com.indexia.boutique.service;

import com.indexia.boutique.model.dao.ClientesDao;
import com.indexia.boutique.model.dao.MedioPagoDao;
import com.indexia.boutique.model.dao.ProductoDao;
import com.indexia.boutique.model.entity.DetallesUsuario;
import com.indexia.boutique.model.entity.Productos;
import com.indexia.boutique.util.request.CompraRequest;
import com.indexia.boutique.util.response.CompraResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraServiceImpl implements CompraService{

    @Autowired
    private ProductoDao productoDao;

    @Autowired
    private ClientesDao clientesDao;

    @Autowired
    private MedioPagoDao medioPagoDao;

    @Override
    public CompraResponse saveCompra(CompraRequest request) {
        DetallesUsuario cliente = clientesDao.getReferenceById(request.getIdCliente());

        List<Productos> producto;


        return null;
    }
}
