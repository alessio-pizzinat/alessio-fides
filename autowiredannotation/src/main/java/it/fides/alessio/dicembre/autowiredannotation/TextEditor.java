package it.fides.alessio.dicembre.autowiredannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	private SpellChecker sc;
	
	public SpellChecker getSc() {
		return sc;
	}
	@Autowired
	public void setSc(SpellChecker sc) {
		System.out.println("All'interno del costruttore del TextEditor");
		this.sc = sc;
	}
	public void spellCheck() {
		sc.spellChecking();
	}

}
