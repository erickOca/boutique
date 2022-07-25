package com.erick.boutique.model.mapper;

import com.erick.boutique.model.entity.Producto;
import com.erick.boutique.model.request.ProductoRequest;
import com.erick.boutique.model.response.ProductoResponse;
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
    @Mapping(source = "categoria",target = "categoria")
    @Mapping(source = "talla",target = "talla")
    @Mapping(source = "genero",target = "genero")
    ProductoResponse toDto(Producto producto);
    @InheritInverseConfiguration
    Producto toEntity(ProductoRequest productoRequest);
}
