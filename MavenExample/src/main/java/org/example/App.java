package org.example;

import org.example.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        Employee e=ctx.getBean("emp", Employee.class);

        System.out.println(e);

    }
}
