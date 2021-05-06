package com.roman.domain;

public class BeanA {
    private String name;

    public BeanA() {
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                '}';
    }
}
