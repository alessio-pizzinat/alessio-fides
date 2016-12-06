package it.fides.alessio.dicembre.aoptramitexml;

public class Logging {
	
	public void beforeAdvice() {
		System.out.println("In procinto di impostare il profilo studente");
	}
	public void afterAdvice() {
		System.out.println("Profilo studente impostato");
	}
	public void afterReturningAdvice(String retVal) {
		System.out.println("Restituendo: " + retVal.toString());
	}
    public void afterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("E' stata sollevata un'eccezione: " + ex.toString());
    }


}
