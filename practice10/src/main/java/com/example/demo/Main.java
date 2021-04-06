package com.example.demo;

import com.example.demo.components.Junior;
import com.example.demo.components.Middle;
import com.example.demo.components.Senior;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class Main {
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Programmer musician1 = context.getBean(Junior.class);
        Programmer musician2 = context.getBean(Middle.class);
        Programmer musician3 = context.getBean(Senior.class);
        musician1.doCoding();
        musician2.doCoding();
        musician3.doCoding();
    }
}
