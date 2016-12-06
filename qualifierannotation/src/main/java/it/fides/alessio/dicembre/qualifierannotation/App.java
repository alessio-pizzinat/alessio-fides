package it.fides.alessio.dicembre.qualifierannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	Profile pr = (Profile) context.getBean("profile");
    	
    	pr.printName();
    	pr.printAge();
    }
}
