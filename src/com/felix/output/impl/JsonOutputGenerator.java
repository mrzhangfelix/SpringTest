package com.felix.output.impl;

import com.felix.output.IOutputGenerator;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class JsonOutputGenerator implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("Json Output Generator");

    }
}
