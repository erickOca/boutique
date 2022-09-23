package com.indexia.boutique.model.mapper;

import com.indexia.boutique.model.entity.Users;
import com.indexia.boutique.util.request.UserRequest;
import com.indexia.boutique.util.response.UserResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    @Mapping(source = "nombre",target = "nombre")
    @Mapping(source = "apellidos",target = "apellidos")
    @Mapping(source = "email",target = "email")
    @Mapping(source = "password",target = "password")
    UserResponse toDto(Users users);
    List<UserResponse> toDtoLis(List<Users> users);
    @InheritInverseConfiguration
    Users toEntity(UserRequest userRequest);
}
