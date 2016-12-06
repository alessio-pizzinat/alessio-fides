package it.fides.alessio.primoesempio.ciaomondo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		CiaoMondo ogg = (CiaoMondo) context.getBean("ciaoMondo");
		ogg.getMessage();

	}

}
