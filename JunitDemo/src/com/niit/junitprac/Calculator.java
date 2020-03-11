package com.niit.junitprac;

public class Calculator {

	public double addd(double a,double b){
		return a+b;
	}
	
	public double subtract(double a,double b){
		return a-b;
	}
	
	public double multiply(double a,double b){
		return a*b;
	}
	
	public double divide(double a,double b){
		if(b==0){
			throw new ArithmeticException();
		}
		return a/b;
	}
}
