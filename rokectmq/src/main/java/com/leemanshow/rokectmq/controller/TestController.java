package com.leemanshow.rokectmq.controller;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leemanshow")
public class TestController implements FactoryBean {
    @GetMapping("/get")
    public String helll(){
        return "ddd";
    }

    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
