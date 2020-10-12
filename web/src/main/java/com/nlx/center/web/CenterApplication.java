package com.nlx.center.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Tony.niu (hystrix0779@yeah.net)
 * @version V1.0
 * @date 2020/10/10
 **/
@SpringBootApplication
@ComponentScan("com.nlx.center")
public class CenterApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CenterApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(CenterApplication.class, args);
    }

}
