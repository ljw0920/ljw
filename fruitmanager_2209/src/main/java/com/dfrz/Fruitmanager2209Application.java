package com.dfrz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.dfrz.mapper")
public class Fruitmanager2209Application {

    public static void main(String[] args) {
        SpringApplication.run(Fruitmanager2209Application.class, args);
    }

}
