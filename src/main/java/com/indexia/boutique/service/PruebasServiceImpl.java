package com.indexia.boutique.service;

import com.indexia.boutique.model.dao.ClientesDao;
import com.indexia.boutique.model.dao.MedioPagoDao;
import com.indexia.boutique.model.dao.ProductoDao;
import com.indexia.boutique.model.entity.DetallesUsuario;
import com.indexia.boutique.model.entity.MedioPago;
import com.indexia.boutique.model.entity.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class PruebasServiceImpl implements PruebasService {

    @Autowired
    MedioPagoDao medioPagoDao;

    @Autowired
    private ClientesDao clientesDao;

    @Autowired
    private ProductoDao productoDao;

    @Override
    public void inserTotal1() {
        DetallesUsuario cliente = new DetallesUsuario(1, "Erick", "Ocampo", "Cortez", "En la calle", "Hombre",new Date(112,7,1,10,30,15),
                true, "ErickPerra@gamil.com", "32", "10", "Arroyo", "Arroyo", "Guerrero", "Taxco de Alarcon", "Mexico");

        Productos producto1 = new Productos(1, "camisa", "camisa de manga corta", 50, "pol", "M", "rojo", 3, "fdfs32", "verano", "M", "camisa");

        Productos producto2 = new Productos(2, "pantalon", "pantalon corte recto", 200, "mex", "M", "blanco", 12, "csdd223", "verano", "M", "pantalon");

        MedioPago medioPago = new MedioPago(1, "Efectivo", true);

        clientesDao.save(cliente);
        productoDao.save(producto1);
        productoDao.save(producto2);
        medioPagoDao.save(medioPago);
    }
}
