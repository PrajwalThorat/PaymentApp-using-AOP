package org.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.stackroute.service.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        
        PaymentService pay= (PaymentService) context.getBean("payment");
        
        pay.makePAyment();
    }
}
