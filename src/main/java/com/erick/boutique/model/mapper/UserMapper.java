package com.erick.boutique.model.mapper;

import com.erick.boutique.model.entity.Usuarios;
import com.erick.boutique.model.request.UsuarioRequest;
import com.erick.boutique.model.response.UsuarioResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    @Mapping(source = "",target = "username")
    @Mapping(source = "",target = "email")
    @Mapping(source = "",target = "password")
    @Mapping(source = "",target = "nombre")
    @Mapping(source = "",target = "apellidoPaterno")
    @Mapping(source = "",target = "apellidoMaterno")
    @Mapping(source = "",target = "rol")
    @Mapping(source = "",target = "estatus")
    @Mapping(source = "",target = "colonia")
    @Mapping(source = "",target = "calle")
    @Mapping(source = "",target = "ciudad")
    @Mapping(source = "",target = "estado")
    UsuarioResponse toDto(Usuarios usuarios);
    @InheritInverseConfiguration
    Usuarios toEntity(UsuarioRequest usuarioRequest);
}
