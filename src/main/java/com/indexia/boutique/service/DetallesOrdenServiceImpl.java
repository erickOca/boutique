package com.indexia.boutique.service;

import com.indexia.boutique.model.dao.DetallesOrdenDao;
import com.indexia.boutique.model.dao.ProductoDao;
import com.indexia.boutique.model.entity.DetallesOrden;
import com.indexia.boutique.model.entity.Productos;
import com.indexia.boutique.model.mapper.DetallesOrdenMapper;
import com.indexia.boutique.util.request.DetallesOrdenRequest;
import com.indexia.boutique.util.response.DetallesOrdenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//mapipa
@Service
public class DetallesOrdenServiceImpl implements DetallesOrdenService{

    @Autowired
    DetallesOrdenDao detallesOrdenDao;

    @Autowired
    DetallesOrdenMapper detallesOrdenMapper;

    @Autowired
    ProductoDao productoDao;


    @Override
    public DetallesOrdenResponse saveDetallesOrde(DetallesOrdenRequest request) {
        DetallesOrdenResponse response = new DetallesOrdenResponse();
        Productos producto = productoDao.getReferenceById(request.getIdProducto());
        DetallesOrden detallesOrden = detallesOrdenMapper.INSTANCE.toMapperEntity(request);
        detallesOrden.setProductos(producto);
        detallesOrden.setImporte(producto.getPrecio() * detallesOrden.getUnidades());
        response = detallesOrdenMapper.toMapperDto(detallesOrdenDao.save(detallesOrden));

        return response;
    }

    @Override
    public DetallesOrdenResponse updateDetallesOrde(DetallesOrdenRequest request, int id) {

        if (detallesOrdenDao.findById(id) != null){
            Productos producto = productoDao.getReferenceById(request.getIdProducto());
            DetallesOrden detallesOrden = new DetallesOrden(
                    id,
                    request.getUnidades(),
                    request.getUnidades() * producto.getPrecio(),
                    request.getNDeCarro(),
                    producto
            );
            DetallesOrdenResponse response = detallesOrdenMapper.toMapperDto(detallesOrdenDao.save(detallesOrden));
            return response;
        }else {
            System.out.printf("Id invalido intenta otra ves ");
            return null;
        }
    }

    @Override
    public void deleteDetallesOrde(int id) {
        if (detallesOrdenDao.findById(id) != null) {
            detallesOrdenDao.deleteById(id);
        }else{
            System.out.printf("no se pudo encontrar el detalle de venta ");
        }
    }

   @Override
    public List<DetallesOrdenResponse> findByNDeCarro(int nDeCarro) {
        List<DetallesOrdenResponse> list = detallesOrdenMapper.toMapperDtoLis(detallesOrdenDao.findByNDeCarro(nDeCarro));
        if (list != null){
            return list;
        }else{
            System.out.printf("No se encontraron detalles de benta ");
            return list;
        }

    }


}
