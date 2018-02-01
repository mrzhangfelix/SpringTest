package com.felix.aware;

import com.felix.base.JunitBase;
import org.junit.Test;

import static org.junit.Assert.*;

public class FelixAppContextTest extends JunitBase {
    @Test
    public void felixAppContextTest(){
        FelixAppContext felixAppContext=super.getBean("FelixAppContext");
        felixAppContext.resource();

    }

}