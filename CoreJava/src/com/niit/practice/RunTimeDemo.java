package com.niit.practice;

//import org.omg.SendingContext.RunTime;

public class RunTimeDemo {

	protected RunTimeDemo(){
		
	}
	
	public static void main(String[] args) {
	
		Runtime objRun=Runtime.getRuntime();
		Process objprocess=null;
		
		try{
			objprocess=objRun.exec("calc.exe");
		}
		
		catch(Exception e){
			System.out.println("Error executing Calculator");
		}

	}

}
