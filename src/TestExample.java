import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.StringJoiner;

public class TestExample {
	
	public static void main(String args[]) {
		Random r= new Random();
		StringJoiner jo= new StringJoiner(",");
		List<String> list= new ArrayList<String>();
		list.add("90");
		list.add("12");
		list.add("23");
		
	String min=	list.stream().min(Comparator.comparing(Integer:: valueOf)).get();
	int n=Integer.valueOf(min);
		jo.setEmptyValue("yyu  uiii uuu");
		//jo.
		jo.add(list.get(0)).add(list.get(1));
		Map<Integer,Integer> map= new HashMap<Integer, Integer>();
		map.put(1,1);
		map.put(2, 1);
		map.put(3, 2);
		Iterator<Map.Entry<Integer, Integer>> imap=map.entrySet().iterator();
		while(imap.hasNext()){
			imap.next();
			
		}
		
//	 int max=Collections.max(map.values());
//		int a=9;
//		int b=8;
//		//int temp=0;
//		a=a+b-a;
//		b=a-b;
//		System.out.println(a+""+b);
	}

}
