package com.felix.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:res/res.xml")
public class StoreConfig {
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;


//    @Bean(name="store",initMethod = "init",destroyMethod = "destroy")

    @Autowired
    private Store<String> s1;
    @Autowired
    private Store<Integer> s2;


    @Bean
    public StringStore stringStore(){
        return new StringStore();
    }
    @Bean
    public IntegerStore integerStore(){
        return new IntegerStore();
    }

    @Bean
    public String testG(){
        System.out.println("s1:::"+s1.getClass().getName());
        System.out.println("s2:::"+s2.getClass().getName());
        return new String("zpf");
    }
}
