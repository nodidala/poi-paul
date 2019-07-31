package com.poipaul;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.poipaul.mapper")
public class PoiPaulApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoiPaulApplication.class, args);
    }

}
