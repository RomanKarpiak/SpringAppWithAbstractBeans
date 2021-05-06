package com.roman.domain;

public class BeanC {
    public BeanD getBeanD(){
        return null;
    }
    public String getFriend(String name){
        BeanD beanD = new BeanD();
        beanD.setName(name);
        return "BeanC friends with " + beanD.getName();
    }


}
