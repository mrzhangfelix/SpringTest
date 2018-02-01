package com.felix.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JunitBase {

    private ClassPathXmlApplicationContext context;
    private String springXmlPath= "applicationContext.xml";
    public JunitBase(){}
    public JunitBase(String springXmlPath){
        this.springXmlPath=springXmlPath;
    }

    @Before
    public void setUp() throws Exception {
        context=new ClassPathXmlApplicationContext(new String[] {springXmlPath});
        context.start();
    }

    @After
    public void tearDown() throws Exception {
        context.destroy();
    }

    protected <T extends Object> T getBean(String beanId){
        return (T)context.getBean(beanId);
    }


}
