package com.felix.output.impl;

import com.felix.output.IOutputGenerator;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class CsvOutputGenerator implements IOutputGenerator
{
    public void generateOutput(){
        System.out.println("Csv Output Generator");
    }
}