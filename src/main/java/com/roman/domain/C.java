package com.roman.domain;

public class C {
    public  D getD(){
        return null;
    }
    public String getFriend(String name){
        D d = new D();
        d.setName(name);
        return "C friends with " + d.getName();
    }


}
