package com.revature.app;

public class Pet {
	String name;
	String color;

public Pet( String name, String color) {
	this.name = name;
	this.color = color;
}



	public void petInfo() {
		System.out.println("Dog name is " + name);
		System.out.println("Dog color is " + color);
	}

}
