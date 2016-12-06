package it.fides.alessio.dicembre.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	
    	TextEditor te = (TextEditor) context.getBean("textEditor");
    	
    	System.out.println(te.getName());
    	te.spellCheck();
    	
    }
}
