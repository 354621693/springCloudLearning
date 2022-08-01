package com.leemanshow.manshowshop.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.leemanshow.**.feign")
public class ManshowShopOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManshowShopOrderApplication.class, args);
    }

}
