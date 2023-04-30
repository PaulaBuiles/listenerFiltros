package com.example.listenerFiltros.service;

import com.example.listenerFiltros.model.Producto;

import java.util.List;

public interface ProductService {
     List<Producto> listar();
     Producto getProductById(long id);
}

