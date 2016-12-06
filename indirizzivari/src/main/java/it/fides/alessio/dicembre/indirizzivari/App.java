package it.fides.alessio.dicembre.indirizzivari;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
    	
    	jc.getAddressList();
    	
    	Indirizzo i1 = (Indirizzo) jc.getAddressList().get(1);
    	System.out.println("Via: " + i1.getVia() + " - Civico: " + i1.getCivico());
    }
}
