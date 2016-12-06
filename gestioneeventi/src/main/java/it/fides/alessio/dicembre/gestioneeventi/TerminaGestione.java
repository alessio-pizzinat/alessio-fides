package it.fides.alessio.dicembre.gestioneeventi;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class TerminaGestione implements ApplicationListener<ContextStoppedEvent>{

	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("Ricevuta la richiesta di Termine Evento");
	}

}
