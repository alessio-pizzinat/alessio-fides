package it.fides.alessio.dicembre.aoptramitexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	
    	Student st = (Student) context.getBean("student");
    	
    	System.out.println("Nome: " + st.getName());
    	System.out.println("Età: " + st.getAge());
    	
    	st.printThrowException();
    }
}
