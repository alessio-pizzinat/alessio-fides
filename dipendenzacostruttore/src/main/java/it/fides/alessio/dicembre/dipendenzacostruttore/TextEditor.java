package it.fides.alessio.dicembre.dipendenzacostruttore;

public class TextEditor {
	
	private SpellChecker sc;
	
	public TextEditor (SpellChecker sc) {
		System.out.println("All'interno del costruttore del TextEditor");
		this.sc = sc;
	}
	
	public void spellCheck() {
		sc.spellChecking();
	}

}
