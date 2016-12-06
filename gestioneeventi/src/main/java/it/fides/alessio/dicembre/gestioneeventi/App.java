package it.fides.alessio.dicembre.gestioneeventi;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
    public static void main( String[] args ) {
    	
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	
    	HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
    	
    	context.start();
    	
    	obj.getMessage();
    	
    	context.stop();
    }
}
