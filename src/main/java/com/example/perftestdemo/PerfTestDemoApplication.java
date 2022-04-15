package com.example.perftestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PerfTestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PerfTestDemoApplication.class, args);
    }
}
