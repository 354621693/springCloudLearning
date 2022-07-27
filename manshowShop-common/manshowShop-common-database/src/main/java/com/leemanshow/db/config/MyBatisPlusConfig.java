package com.leemanshow.db.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author leewencan
 * @date 2022/7/22 23:07
 */
@Configuration
@MapperScan("com.leemanshow.db.mapper")
public class MyBatisPlusConfig {
}
