package org.shopping.front.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@EnableSwagger2
@SpringBootApplication
public class ShoppingFrontApplication {
    public static void main(String[] args) {

        System.setProperty("javax.net.ssl.trustStore", "C:\\Users\\User\\projects\\ShoppingMicroServicesArchitecture\\ShoppingFrontWebApplication\\src\\main\\resources\\keystore\\invertory.p12");
        System.setProperty("javax.net.ssl.trustStorePassword", "123456");
        System.setProperty("javax.net.ssl.trustStoreType", "pkcs12");
        System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
        System.setProperty("javax.net.ssl.keyStore", "C:\\Users\\User\\projects\\ShoppingMicroServicesArchitecture\\ShoppingFrontWebApplication\\src\\main\\resources\\keystore\\invertory.p12");
        System.setProperty("javax.net.ssl.keyStorePassword", "123456");
        System.setProperty("jdk.internal.httpclient.disableHostnameVerification", Boolean.TRUE.toString());
        SpringApplication.run(ShoppingFrontApplication.class, args);
    }
}
