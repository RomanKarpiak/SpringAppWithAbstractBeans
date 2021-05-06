package com.roman.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanF implements BeanNameAware, ApplicationContextAware, BeanFactoryAware {
    private String name;

    public BeanF() {
        System.out.println("Step 1 - Creating an object via the constructor....");
    }

    public void setName(String name) {
        System.out.println("Step 2 - Setter processing.... ");
        this.name = name;
    }

    @Override
    public void setBeanName(String s) {

        System.out.println("Step 3 - setBeanName executed....");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Step 4 - setBeanFactory,the bean is granted access to the bean factory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Step 5 - setApplicationContext executed....");
    }



    public void init() {
        System.out.println("Step 7 - init-method() Doing initialization class BeanF");
    }



    public void greeting() {
        System.out.println("Hello from class BeanF!");
    }

    public void destroy() {

        System.out.println("Step 9 - destroy-method() Doing my destruction...");
    }

}
