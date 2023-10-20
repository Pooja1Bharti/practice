package com.example;

public class GenericPrint {

	//T obj;
	public static void main(String[] args) {
		
		printObjec(123);
		// TODO Auto-generated method stub

	}

	private  static <T> void printObjec(T t) {
		System.out.println(t);
		
	}

}
