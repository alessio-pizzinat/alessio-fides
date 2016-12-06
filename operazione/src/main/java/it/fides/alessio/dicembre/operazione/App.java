package it.fides.alessio.dicembre.operazione;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	Operazione op = (Operazione) context.getBean("operazione");
    	
    	op.esegui();
    
    }
}
