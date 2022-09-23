package com.indexia.boutique.model.mapper;

import com.indexia.boutique.model.entity.DetallesUsuario;
import com.indexia.boutique.util.request.ClienteRequest;
import com.indexia.boutique.util.response.ClienteResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);
    @Mapping(source = "direccion",target ="direccion")
    @Mapping(source = "sexo",target ="sexo")
    @Mapping(source = "fechaNac",target ="fechaNac")
    @Mapping(source = "estatus",target ="estatus")
    @Mapping(source = "numeroInterior",target ="numeroInterior")
    @Mapping(source = "numeroExterior",target ="numeroExterior")
    @Mapping(source = "calle",target ="calle")
    @Mapping(source = "colonia",target ="colonia")
    @Mapping(source = "ciudad",target ="ciudad")
    @Mapping(source = "pais",target ="pais")
    ClienteResponse toMapperDto(DetallesUsuario detallesUsuario);
    List<ClienteResponse> toMapperDtoLis(List<DetallesUsuario> detallesUsuarioList);
    @InheritInverseConfiguration
    DetallesUsuario toMapperEntity(ClienteRequest clienteRequest);



}
