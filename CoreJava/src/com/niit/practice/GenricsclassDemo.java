package com.niit.practice;

class Test<T>{

	T obj;
	Test(T obj){
		this.obj=obj;
	}
	//Test(){
	//	System.out.println("any");
	//}

	public T getObject(){
		return this.obj;
	}
}
public class GenricsclassDemo {

	public static void main(String[] args) {

		Test <Integer> iObj=new Test<Integer>(15);
		System.out.println(iObj.getObject());
		//Test obj1=new Test();

		Test<String> sObj=new Test<String>("generics");
		System.out.println(sObj.getObject());

		Test<Float> fObj=new Test<Float>(12.2F);
		System.out.println(fObj.getObject());
	}

}
