package com.indexia.boutique.model.mapper;

import com.indexia.boutique.model.entity.MedioPago;
import com.indexia.boutique.util.request.MedioPagoRequest;
import com.indexia.boutique.util.response.MedioPagoResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MedioPagoMapper {

    MedioPagoMapper INSTANCE = Mappers.getMapper(MedioPagoMapper.class);

    @Mapping(source = "formaDePago",target = "formaDePago")
    @Mapping(source = "estatusMedioPago",target = "estatusMedioPago")
    MedioPagoResponse toMapperDto(MedioPago medioPago);
    List<MedioPagoResponse> toMapperDtoLis(List<MedioPago> list);
    @InheritInverseConfiguration
    MedioPago toMapperEntity(MedioPagoRequest request);
}
