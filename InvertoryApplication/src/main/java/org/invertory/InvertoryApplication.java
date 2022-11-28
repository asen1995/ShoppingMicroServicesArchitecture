package org.invertory;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@EnableSwagger2
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class InvertoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(InvertoryApplication.class, args);
    }
}
