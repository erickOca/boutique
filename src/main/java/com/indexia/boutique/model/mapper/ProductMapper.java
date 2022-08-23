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
    @Mapping(source = "descripcion",target = "descripcion")
    @Mapping(source = "precio",target = "precio")
    @Mapping(source = "marca",target = "marca")
    @Mapping(source = "talla",target = "talla")
    @Mapping(source = "stock",target = "stock")
    @Mapping(source = "color",target = "color")
    @Mapping(source = "genero",target = "genero")
    @Mapping(source = "codigoBarras",target = "codigoBarras")
    @Mapping(source = "temporada",target = "temporada")
    ProductoResponse toDto(Productos ucto);
    @InheritInverseConfiguration
    Productos toEntity(ProductoRequest productoRequest);
}