package com.erick.boutique.model.dao;

import com.erick.boutique.model.entity.Producto;
import com.erick.boutique.model.request.ProductoRequest;
import com.erick.boutique.model.response.ProductoResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductoDao extends JpaRepository<Producto, Integer> {



}
