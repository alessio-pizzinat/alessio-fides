package it.fides.alessio.dicembre.operazione;

public class Operazione {
	
	private int num1, num2;
	
	public Operazione (int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void esegui() {
		int res = num1 + num2;
		System.out.println("Il risultato dell'operazione e': " + res);
	}

}
