package it.fides.alessio.dicembre.dipendenzasetter;

public class TextEditor {
	
	private SpellChecker sc;

	
	public SpellChecker getSc() {
		return sc;
	}
	public void setSc(SpellChecker sc) {
		System.out.println("All'interno del costruttore del TextEditor");
		this.sc = sc;
	}
	
	public void spellCheck() {
		sc.spellCkhecking();
	}

}
