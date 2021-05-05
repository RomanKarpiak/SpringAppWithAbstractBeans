package com.roman.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class F implements BeanNameAware, ApplicationContextAware,
        InitializingBean,
        DisposableBean {
    @Override
    public void setBeanName(String s) {
        System.out.println("---setBeanName executed---");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("--- setApplicationContext executed ---");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("--- @PostConstruct executed ---");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("--- afterPropertiesSet executed ---" +
                "Bean F has been instantiated.");
    }
    public void doMyInit() {
        System.out.println("--- init-method ---" +
                "Doing initialization class F");
    }
    public void greeting() {

        System.out.println("Hello from class F!");
    }
    @PreDestroy
    public void preDestroy(){

        System.out.println("--- @PreDestroy executed ---");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("--- destroy executed --- Container has been closed.");
    }
    public void doMyDestroy() {

        System.out.println("--- destroy-method executed --- Doing my destruction...");
    }

}
