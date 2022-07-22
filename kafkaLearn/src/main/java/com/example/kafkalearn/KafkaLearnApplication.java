package com.example.kafkalearn;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class KafkaLearnApplication {

    public static void main(String[] args) {
//        SpringApplication.run(KafkaLearnApplication.class, args);
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(KafkaLearnApplication.class);
        ApplicationContext bean = applicationContext.getBean(ApplicationContext.class);
        return;
    }

}
