package it.fides.alessio.primoesempio.esempiobeanfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext contesto = 
    			new FileSystemXmlApplicationContext("src/main/java/Beans.xml");
    	HelloWorld ogg1 = (HelloWorld) contesto.getBean("helloWorld");
    	HelloWorld ogg2 = (HelloWorld) contesto.getBean("ciaoMilano");
    	ogg1.getMessaggio();
    	ogg2.getMessaggio();
    }
}
