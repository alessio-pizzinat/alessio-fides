package it.fides.alessio.primoesempio.esempioinitdestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor {
	
	public Object postProcessBeforeInitialization (Object bean, String beanName) 
	throws BeansException{
		System.out.println("Prima dell'installazione: " + beanName);
		return bean;
	}
	public Object postProcessAfterInitialization (Object bean, String beanName)
	throws BeansException{
		System.out.println("Dopo l'installazione: " + beanName);
		return bean;
	}

}
