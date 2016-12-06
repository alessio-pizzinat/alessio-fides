package it.fides.alessio.primoesempio.esempioinitdestroy;

public class HelloWorld {
	
	private String message;

	public void getMessage() {
		System.out.println("Ecco: " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Il Bean viene inizializzato");
	}
	
	public void destroy() {
		System.out.println("Il Bean viene rimosso");
	}

}
