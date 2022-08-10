package com.indexia.boutique.model.mapper;

import com.indexia.boutique.model.entity.Productos;
import com.indexia.boutique.util.request.ProductoRequest;
import com.indexia.boutique.util.response.ProductoResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    @Mapping(source = "nombre",target = "nombre")
    @Mapping(source = "marca",target = "marca")
    @Mapping(source = "stock",target = "stock")
    @Mapping(source = "precio",target = "precio")
    @Mapping(source = "talla",target = "talla")
    @Mapping(source = "genero",target = "genero")
    ProductoResponse toDto(Productos producto);
    @InheritInverseConfiguration
    Productos toEntity(ProductoRequest productoRequest);
}