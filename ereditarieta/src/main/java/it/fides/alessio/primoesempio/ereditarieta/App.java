package it.fides.alessio.primoesempio.ereditarieta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	HelloWorld ob1 = (HelloWorld) context.getBean("helloWorld");
    	ob1.getMess1();
    	ob1.getMess2();
    	HelloItalia ob2 = (HelloItalia) context.getBean("helloItalia");
    	ob2.getMess1();
    	ob2.getMess2();
    	ob2.getMess3();
    }
    
}
