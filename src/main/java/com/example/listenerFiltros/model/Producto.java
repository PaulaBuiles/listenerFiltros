package com.example.listenerFiltros.model;

public class Producto {
    private Long id;
    private String name;
    private String type;
    private Integer price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Producto(Long id, String name, String type, Integer price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }
}
