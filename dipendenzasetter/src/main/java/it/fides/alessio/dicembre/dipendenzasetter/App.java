package it.fides.alessio.dicembre.dipendenzasetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	
    	TextEditor te = (TextEditor) context.getBean("textEditor");
    	te.spellCheck();
    }
}
/* Possibilità di innestare il bean all'interno delle property
   <bean id="textEditor" 
   		 class="it.fides.alessio.dicembre.dipendenzasetter.TextEditor">
   		 <property name="sc">
   		 	<bean id="spellChecker"
   				  class="it.fides.alessio.dicembre.dipendenzasetter.SpellChecker">
   			</bean>
   		 </property>
   </bean>
*/