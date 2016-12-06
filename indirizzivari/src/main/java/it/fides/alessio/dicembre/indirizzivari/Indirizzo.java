package it.fides.alessio.dicembre.indirizzivari;

public class Indirizzo {
	
	private String via;
	private int civico;
	
	public Indirizzo (String via, int civico) {
		System.out.println("Entrato nel costruttore");
		this.via = via;
		this.civico = civico;
		
		System.out.println("OGGETTO COSTRUITO");
		System.out.println("Via: " + this.via);
		System.out.println("Civico: " + this.civico);
	}
	
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public int getCivico() {
		return civico;
	}
	public void setCivico(int civico) {
		this.civico = civico;
	}

}
