package it.fides.alessio.dicembre.autowiring;

public class TextEditor {
	
	private SpellChecker sc;
	private String name;
	
	public TextEditor (SpellChecker sc, String name) {
		this.sc = sc;
		this.name = name;
	}
	
	public SpellChecker getSc() {
		return sc;
	}
	public void setSc(SpellChecker sc) {
		System.out.println("All'interno del costruttore del TextEditor");
		this.sc = sc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void spellCheck() {
		sc.spellChecking();
	}

}
