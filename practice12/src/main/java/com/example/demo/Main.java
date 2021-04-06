package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
    @Autowired
    private Hash hash;

    @Override
    public void run(String... args) throws Exception {
        if (args.length == 2) hash.start(args[0], args[1]);
        else hash.hash();
    }
    public static void main(String[] args){
        SpringApplication app = new SpringApplication(Main.class);
        app.run(args);
    }
}
