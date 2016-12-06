package it.fides.alessio.dicembre.gestioneeventi;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class AvviaGestione implements ApplicationListener<ContextStartedEvent>{

	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("Ricevuta la richiesta di Avvio Evento");
	}

}
