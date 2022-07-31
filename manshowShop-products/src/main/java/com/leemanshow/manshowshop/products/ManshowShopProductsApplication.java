package com.leemanshow.manshowshop.products;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.leemanshow.manshowShop" })
@MapperScan("com.leemanshow.manshowshop.products.mapper")
public class ManshowShopProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManshowShopProductsApplication.class, args);
    }

}
