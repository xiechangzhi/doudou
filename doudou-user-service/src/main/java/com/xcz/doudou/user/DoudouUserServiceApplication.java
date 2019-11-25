package com.xcz.doudou.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.xcz.doudou.user.mapper")
public class DoudouUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoudouUserServiceApplication.class, args);
    }

}
