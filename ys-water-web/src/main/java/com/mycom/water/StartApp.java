package com.mycom.water;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author yuanss  Date 2018/10/10
 */

@SpringBootApplication
@ImportResource("classpath:/base/applicationContext.xml")
@EnableAsync
public class StartApp {

    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
    }
}
