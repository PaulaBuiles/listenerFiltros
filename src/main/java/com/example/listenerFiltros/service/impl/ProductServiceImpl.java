package com.example.listenerFiltros.service.impl;

import com.example.listenerFiltros.model.Producto;
import com.example.listenerFiltros.service.ProductService;

import java.util.*;

public class ProductServiceImpl implements ProductService {
    private  List<Producto> products = new ArrayList<>();
    @Override
    public List<Producto> listar() {
        return Arrays.asList(new Producto(1L, "notebook", "computacion", 175000),
                new Producto(2L, "mesa escritorio", "oficina", 100000),
                new Producto(3L, "teclado mecanico", "computacion", 40000),
                new Producto(4L, "cuadro decorativo", "decoracion", 50000),
                new Producto(5L, "Cargador portatil", "computacion", 90000),
                new Producto(6L, "mouse inalambrico", "computacion", 70000));
    }

    public Producto getProductById(long id) {
        products = listar();
        return products.stream()
                .filter(p->p.getId()==id)
                .findFirst()
                .orElse(null);

    }
}

