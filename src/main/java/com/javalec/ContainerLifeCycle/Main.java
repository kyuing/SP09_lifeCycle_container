package com.javalec.ContainerLifeCycle;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//spring container life cycle
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();	//creating
		
		ctx.load("classpath:applicationCTX.xml");	//set
		ctx.refresh();	//initializing (refreshing); after using .load, you must use .refresh()
		
		Student student = ctx.getBean("student", Student.class);	//using
		System.out.println("Name: " + student.getName());
		System.out.println("Age: " + student.getAge());
		
		ctx.close();	//closing

	}

}
