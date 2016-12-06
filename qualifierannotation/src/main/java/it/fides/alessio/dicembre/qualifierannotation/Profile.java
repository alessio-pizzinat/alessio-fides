package it.fides.alessio.dicembre.qualifierannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	
	@Autowired
	@Qualifier("student2")
	private Student student;
	
	public Profile() {
		System.out.println("All'interno del costruttore del Profilo");
	}
	
	public void printName() {
		System.out.println("Nome: " + student.getName() );
	}
	
	public void printAge() {
		System.out.println("Età: " + student.getAge());
	}

}
