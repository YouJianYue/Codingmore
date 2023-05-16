package com.yjy.codingmore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CodingmoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodingmoreApplication.class, args);
    }

}
