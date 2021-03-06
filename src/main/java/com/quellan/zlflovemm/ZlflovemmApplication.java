package com.quellan.zlflovemm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableScheduling
public class ZlflovemmApplication {
    public static void main(String[] args) {

        SpringApplication.run(ZlflovemmApplication.class, args);
    }

}
