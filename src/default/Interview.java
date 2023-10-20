package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Interview {

	public static void main(String[] args) {

		test(null);
		String data = compress("aabccaaadd");
		System.out.println(data);
		// a2bc2a3d2
		/*
		 * int i=1; while(i<10) { if(i==5) { continue; } i=i+1; System.out.println(i); }
		 */

	}

	// public static void test(Object o) { System.out.println("inside object"); }

	// public static void test(Integer integer) { System.out.println("inside
	// object"); }

	public static void test(String o) {
		System.out.println("inside String");
	}

	/*
	 * public static void test(Integer o) { System.out.println("inside integer"); }
	 */

	public static String compress(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		List list = new ArrayList();
		// map.put(null, null)
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {

				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);

			} else {
				for (Entry<Character, Integer> mapEntry : map.entrySet()) {
					list.add(mapEntry.getKey());
					// mapEn
					if (mapEntry.getValue() > 1)
						list.add(mapEntry.getValue());
				}
				map.clear();
				map.put(s.charAt(i), 1);

			}

		}
		if(!map.isEmpty()) {
			for(Entry<Character, Integer> entry: map.entrySet()) {
				list.add(entry.getKey());
				if(entry.getValue()> 1)
					list.add(entry.getValue());
				map.clear();
			}
			
		}
		String so="";
		for(int i=0;i<list.size();i++) {
			so=so+list.get(i);
		}

		return so;
	}
}
