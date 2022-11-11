
package com.microservice.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigMessage {

    @Value("${name:Hello Welcome to OCP Red Hat}")
    private String message;
 
    @GetMapping("/")
    public String getMessage() {
        return this.message;
    }

}
