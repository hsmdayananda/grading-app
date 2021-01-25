package com.demo.madara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author madara
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.demo.madara")
public class StudentGradingApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(StudentGradingApplication.class,args);
    }
}
