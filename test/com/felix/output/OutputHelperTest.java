package com.felix.output;

import com.felix.base.JunitBase;
import org.junit.Test;

import static org.junit.Assert.*;

public class OutputHelperTest extends JunitBase{
    public OutputHelperTest(){
        super("Spring-Common.xml");
    }
    @Test
    public void say() throws Exception {
        OutputHelper op=super.getBean("outputHelper");
        op.say();
    }

}