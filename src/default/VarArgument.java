package com.example;

import java.util.ArrayList;
import java.util.List;

public class VarArgument {

	public static void main(String[] args) {
		List<List<Integer>> listdata= new ArrayList<List<Integer>>();
		
		List<Integer> list= new ArrayList<>();
		list.add(12);
		listdata.add(list);
		
		int n=3;
		int num[]= {2,3,5,6,7,8};
		
		n=n%2;
		System.out.println(n);
		varargs(1,"Pooja",2.5,false);
		// TODO Auto-generated method stub

	}

	public static void varargs(Object... objects ) {
		for(Object o:objects)
		System.out.println(o);
	}
}
