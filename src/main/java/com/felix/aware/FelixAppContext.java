package com.felix.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class FelixAppContext implements ApplicationContextAware{
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        System.out.println("felixappcontext::::::"+applicationContext.getBean("FelixAppContext"));
        this.applicationContext=applicationContext;
    }
    public void resource(){
        Resource resource=applicationContext.getResource("classpath:com/felix/aware/resource.txt");
        System.out.println("文件名"+resource.getFilename());
        try {
            System.out.println("文件长度"+resource.contentLength());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
