package com.revature.driver

public class Driver {
	//single comment
       /* 
	* Multi
	* Line
	* Comment
	* Ha
	* ha
	*/
	/*
	* Why Java?
        * "WORA" principal
	*	"Write once, Run anywhere"
	* OOP
	* Widespread use
	* Great Documentation
	* Oracle
	* Sun Microsystems used to own it...
	* version 1.8 "Java 8"
	*
	* 3 common acronyms - JDK, JRE, JVM
	* JVM- Java Virtual Machine
	*	converts compiled Java code into
	*	Provides Portability
	* JRE- Java Runtime Environment
	*	JVM+ libraries!
	* Everything we need to write Java
	* Object Oriented Programming
	* Java is ^!
	* unit of programmability is the object
	* Objects have states and behaviors
	* States- aka fields, attributes, variables, etc.
	* Behaviors- methods
	* Classes- blueprint or template of an object
	*/

	public static void main(String[] args) {
		/* public- access modifier, everything can access it
		 * static- do not need to instantiate to use/belongs to the class
		 * void- no return value
		 * String[] args- parameter(s) used for this method
		 * 
		 */
		System.out.println("Roll Tide");
		Human h = new Human();
		System.out.println("Roll Tide");
		h.setName("Matt");
		h.setAge(34);
		h.setWeight(270);
		System.out.println(h)
		
	}
}
		

}
