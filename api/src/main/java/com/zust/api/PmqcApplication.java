package com.zust.api;

import com.zust.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.zust.dao","com.zust.api","com.zust.service"})
public class PmqcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmqcApplication.class, args);
    }
}
