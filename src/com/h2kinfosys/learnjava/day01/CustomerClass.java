package com.h2kinfosys.learnjava.day01;
/*
 * Classes carrying data and accessors of phsyical entity
 * POJO - Plain Old Java Object
 * Beans
 * Persistant
 * Entity
 * Models classes
 */
public class CustomerClass {
	
	// Variables
	// 
	
	// Methods - Accessor
	
	String firstName;
	String lastName;
	String address;
	long phone_number;
	int int1;
	byte byte1;
	char char1;
	long long1;
	float float1;
	double double1;
	
	
	public static void main(String[] args) {
		
		CustomerClass class1 = new CustomerClass();
		
		
		System.out.println(class1.firstName);
		System.out.println(class1.lastName);
		System.out.println(class1.long1);
		System.out.println(class1.float1);
		System.out.println(class1.double1);
	}
	
	
	
	
	

}
