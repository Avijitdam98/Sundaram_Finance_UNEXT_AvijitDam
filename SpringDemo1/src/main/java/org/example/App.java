
package org.example;
package org.example;  // Changed to a consistent package

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.config.AppConfig;
import com.model.Employee;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee e = ctx.getBean("getEmpObject", Employee.class);
        System.out.println(e);
    }
}

