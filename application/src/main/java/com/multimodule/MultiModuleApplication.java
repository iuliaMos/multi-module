package com.multimodule;

import com.example.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages = "com.example")
public class MultiModuleApplication {

    private final MyService service;

    public MultiModuleApplication(MyService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return service.message();
    }

    public static void main(String[] args) {
        SpringApplication.run(MultiModuleApplication.class, args);
    }

}