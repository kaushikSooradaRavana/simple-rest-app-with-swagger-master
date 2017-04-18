package com.cinteo.oneweb.mbusa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author Gregor Zurowski
 *
 */
@EnableSwagger2
@ComponentScan(basePackages = { "com.daimler.oneweb", "com.cinteo.oneweb" })
@SpringBootApplication
public class SimpleRestWithSwaggerApplication {

    public static void main(final String[] args) {
        SpringApplication.run(SimpleRestWithSwaggerApplication.class, args);
    }

}
