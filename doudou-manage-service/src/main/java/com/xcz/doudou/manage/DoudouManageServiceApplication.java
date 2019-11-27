package com.xcz.doudou.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.xcz.doudou.manage.mapper")
public class DoudouManageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoudouManageServiceApplication.class, args);
    }

}
