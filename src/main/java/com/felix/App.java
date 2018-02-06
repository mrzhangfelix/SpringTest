package com.felix;

import com.felix.common.Customer;
import com.felix.output.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

//    public static void main( String[] args )
//    {
//        IOutputGenerator output = new CsvOutputGenerator();
//        output.generateOutput();
//    }
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"Spring-Common.xml"});

        OutputHelper output = (OutputHelper)context.getBean("outputHelper");
        output.generateOutput();

    }

}
