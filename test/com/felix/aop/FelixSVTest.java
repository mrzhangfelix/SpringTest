package com.felix.aop;

import com.felix.base.JunitBase;
import org.junit.Test;

import static org.junit.Assert.*;

public class FelixSVTest extends JunitBase{
    public FelixSVTest(){
        super("Spring-AOP.xml");
    }

    @Test
    public void testaspect(){
        FelixSV fe=super.getBean("felixSV");
        try {
            fe.felix();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}