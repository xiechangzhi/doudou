package com.xcz.doudou.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.xcz.doudou.user.mapper")
public class DoudouUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoudouUserApplication.class, args);
    }

}
