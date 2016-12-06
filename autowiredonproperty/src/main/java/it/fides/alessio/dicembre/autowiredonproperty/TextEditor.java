package it.fides.alessio.dicembre.autowiredonproperty;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	@Autowired
	private SpellChecker sc;
	@Autowired
	private String name;
	
	public TextEditor() {
		System.out.println("All'interno del costruttore del TextEditor");
	}
	
	public SpellChecker getSc() {
		return sc;
	}
	public String getName() {
		return name;
	}
	public void spellCheck() {
		sc.spellChecking();
	}

}
