package com.javalec.ContainerLifeCycle;

public class Student {

	private String name;
	private int age;
	
	public Student(String name, int age) {
		//a specified constructor
		this.name = name;
		this.age = age;
	}
	
	//Since we are using the specified constructor, we only need getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
