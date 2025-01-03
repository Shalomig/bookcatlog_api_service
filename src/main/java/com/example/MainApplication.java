
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EntityScan(basePackages = "com.example.model") // Ensure it scans your model package
public class MainApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MainApplication.class, args);

        // Retrieve the environment to fetch the actual port number
        Environment environment = context.getEnvironment();
        String port = environment.getProperty("local.server.port");

        System.out.println("Book API service is running on port: " + port);
    }
}






