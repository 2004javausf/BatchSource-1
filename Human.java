package com.revature.beans;
//Packages are just very fancy colders. Namespace

/*
 * Naming Conventions
 * Classes and Projects: Pascal casing, Capitalize 1st letter of each word
 * Methods and variables: Camel casing, ex. firstSecondThird
 * packages: lowercase and delimited by periods
 * Constants: ALL_CAPS_LOLZ typically delimited by underscores
 */

public class Human {
	/*
	 * Members of a class- couple of forms
	 * Instance variables- property of a specific object (human's name)
	 * Static variables - property of the class shared by all of its instances
	 * instance methods - behavior relative to a specific object
	 * static methods- behavior relative to entire class
	 * constructor- instantiates the class using the keyword "new"
	 */

        private String name;
	private int age;
	private int weight;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public void setWeight(){
		this.weight = weight;
	}

	public String toString() {
		return "Human ["name
	}	


}