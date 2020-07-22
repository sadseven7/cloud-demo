package com.sad7.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.sad7.demo.provider.mapper")
public class ProviderAdminServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderAdminServiceApplication.class, args);
    }

}
