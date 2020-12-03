package com.h2kinfosys.learnjava.day01;

public class MyHelloWorkd {
	
	int age = 21; //Instance Variables - Available for everyone
	Integer inta = 21;
	//Primitive Variables - 8
	// Numeric Data 
	Byte a = 127;
	int aa = 11;
	short bb;
	Short bbb = 12;
	long cc = 999999999999999999L;
	Long ccc = 999999999999999999L;
	float ddd = 112.121f;
	double eee = 1212;
	String string;
	
	public static void main(String[] args)
	{
		int distance = 21; //Local Variable
//		MyHelloWorkd aaa = new MyHelloWorkd();
		System.out.println("This is a test " +  new MyHelloWorkd().age);
		System.out.println("This is a bbb  " +  new MyHelloWorkd().bbb);
		System.out.println("This is a ccc  " +  new MyHelloWorkd().ccc);
		System.out.println("This is a test " +  Byte.MAX_VALUE + " Min Value " + Byte.MIN_VALUE);
		
		
		
	}
	

}
