package com.felix;

import com.felix.base.JunitBase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;
@RunWith(BlockJUnit4ClassRunner.class)
public class HelloWorldTest extends JunitBase{

    @Test
    public void printHello() throws Exception {

        HelloWorld obj = super.getBean("helloBean");
        obj.printHello();

    }

}