package com.felix.common;

import com.felix.base.JunitBase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class CustomerTest extends JunitBase {
    @Test
    public void toStringTest() throws Exception {
        Customer cust = super.getBean("CustomerBean");
        System.out.println(cust.toString());
    }

}