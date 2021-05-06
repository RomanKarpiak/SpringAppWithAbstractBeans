package com.roman.domain;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class NewBeanE implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] objects) throws Throwable {
        System.out.println("Hello from  class NewBeanE");
        return obj;
    }
}
