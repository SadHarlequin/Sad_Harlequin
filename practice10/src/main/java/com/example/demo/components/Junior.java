package com.example.demo.components;

import org.springframework.stereotype.Component;
import com.example.demo.Programmer;

@Component
public class Junior implements Programmer{
    @Override
    public void doCoding(){
        System.out.println("Junior is Coding");
    }
}
