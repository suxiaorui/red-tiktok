package com.rui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/28 9:23
 * @Version 1.0
 */

@SpringBootApplication
@MapperScan(basePackages = "com.rui.mapper")
@ComponentScan(basePackages = {"com.rui", "org.n3r.idworker"})
@EnableMongoRepositories
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
