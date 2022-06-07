package com.printable.digital.works;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrintableDigitalWorks {
    public static void main(String[] args) {
        SpringApplication.run(PrintableDigitalWorks.class, args);
    }

}
