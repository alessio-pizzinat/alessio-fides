package it.fides.alessio.dicembre.autowiredonproperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	
    	TextEditor te = (TextEditor) context.getBean("textEditor");
    
    	te.spellCheck();
    	System.out.println(te.getName());
    	
    }
}
