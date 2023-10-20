package com.example;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public void regressive(int n) {
		System.out.println("entered..."+n);
		Map<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "Pooja");
		map.put(2, "rahul");
		map.put(1,"test");
		/*
		 * for(int i=0;i<n;i++) { System.out.println(""+i); }
		 */
		
	}
	public static void main(String args[]) {
		Test test=new Test();
		int n=10;
		for(int i=0;i<n;i++)
		test.regressive(i);
		
	}

}
