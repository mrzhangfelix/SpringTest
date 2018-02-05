package com.felix.store;

import com.felix.base.JunitBase;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoreTest extends JunitBase{
    public StoreTest(){
        super("Spring-Common.xml");
    }
    @Test
    public void say() throws Exception {
        StringStore st=super.getBean("store");
        System.out.println(st.getClass().getName());
        st.loadres();

    }
    @Test
    public void testG(){
        String s=super.getBean("testG");
    }

}