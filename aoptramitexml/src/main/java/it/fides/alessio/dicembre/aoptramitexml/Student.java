package it.fides.alessio.dicembre.aoptramitexml;


public class Student {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void printThrowException() {
		System.out.println("Eccezione sollevata");
		throw new IllegalArgumentException();
	}

}