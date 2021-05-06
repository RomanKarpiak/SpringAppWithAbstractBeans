package com.roman.domain;

public class BeanB {
    private BeanA beanA;

    public BeanB(BeanA beanA) {
        this.beanA = beanA;
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "beanA=" + beanA +
                '}';
    }
}
