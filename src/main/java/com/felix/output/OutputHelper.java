package com.felix.output;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class OutputHelper {

    @Autowired
            @Qualifier("jsonOutputGenerator")
    List<IOutputGenerator> list;

    @Autowired
    Map<String,IOutputGenerator> map;



    @Autowired(required = false)
    @Qualifier("jsonOutputGenerator")
    IOutputGenerator outputGenerator;



    public void generateOutput(){
        outputGenerator.generateOutput();
    }
    public void say(){
        if(list!=null&&list.size()!=0){
            System.out.println("list is not null");
            for(IOutputGenerator io:list){
                System.out.println(io.getClass().getName());
            }
        }else {
            System.out.println("list is null");
        }
        if(map!=null&&map.size()!=0){
            System.out.println("map is not null");
            for(Map.Entry<String,IOutputGenerator> entry :map.entrySet()){
                System.out.println(entry.getKey()+"     "+entry.getValue());
            }
        }else{
            System.out.println("map is null");
        }
    }
    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
}
