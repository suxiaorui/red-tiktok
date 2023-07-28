package com.rui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/28 9:23
 * @Version 1.0
 */

@SpringBootApplication
@MapperScan(basePackages = "com.rui.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
