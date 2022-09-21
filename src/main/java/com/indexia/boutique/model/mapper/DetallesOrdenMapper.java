package com.indexia.boutique.model.mapper;

import com.indexia.boutique.model.entity.DetallesOrden;
import com.indexia.boutique.util.request.DetallesOrdenRequest;
import com.indexia.boutique.util.response.DetallesOrdenResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DetallesOrdenMapper {

    DetallesOrdenMapper INSTANCE = Mappers.getMapper(DetallesOrdenMapper.class);

    @Mapping(source = "unidades"  , target = "unidades")
    @Mapping(source = "productos" , target = "producto")
    DetallesOrdenResponse toMapperDto(DetallesOrden detallesOrden);
    List<DetallesOrdenResponse> toMapperDtoLis(List<DetallesOrden> detallesOrdens);
    @InheritInverseConfiguration
    DetallesOrden toMapperEntity(DetallesOrdenRequest request);



}
