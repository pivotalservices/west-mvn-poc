package com.west.uc.webpoc;

import org.apache.commons.math3.primes.Primes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class WebpocApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebpocApplication.class, args);
    }

    @GetMapping("/")
    public String root() {
        int random = new Random().nextInt(Integer.MAX_VALUE);
        int nextPrime = Primes.nextPrime(random);
        return "Hello world, random [" + random + "] next prime [" + nextPrime + "]";
    }
}
