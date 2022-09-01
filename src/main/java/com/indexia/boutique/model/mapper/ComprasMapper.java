package com.indexia.boutique.model.mapper;

import com.indexia.boutique.model.entity.Compras;
import com.indexia.boutique.util.request.ClienteRequest;
import com.indexia.boutique.util.request.ComprasRequest;
import com.indexia.boutique.util.response.ClienteResponse;
import com.indexia.boutique.util.response.ComprasResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ComprasMapper {

    ComprasMapper INSTANCE = Mappers.getMapper(ComprasMapper.class);

    @Mapping(source = "fechaCompra",target ="fecha_compra")
    @Mapping(source = "medioPago",target ="medio_pago")
    @Mapping(source = "comentario",target ="comentario")
    @Mapping(source = "estatusCompra",target ="estatusCompra")
    @Mapping(source = "subTotal",target ="sub_total")
    ComprasResponse toMapperDto(Compras compras);

    List<ComprasResponse> toMapperDtoLis(List<Compras> comprasList);

    @InheritInverseConfiguration
    Compras toMapperEntity(ComprasRequest comprasRequest);
}
