import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Teast {
	public static void main(String args[]) {
		String str="leetcode";
		//char d[]=str.toCharArray();
		
	char num=findUnique(str);
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==num)
			System.out.println("......"+i);
	}
	System.out.println(num);
	}
		  private static char findUnique(String str) {
			  //char[] charact=str.toCharArray();
			  int result=0;
			  //int k=0;
			  char c = 0;
			  char key=0;
			  Set<Character> set= new LinkedHashSet<Character>();
		        HashMap<Character,Integer> hashmap=new LinkedHashMap<Character, Integer>();
		        
		        for(int i=0;i<str.length();i++){
		            if(hashmap.containsKey(str.charAt(i)))
		            {
		                hashmap.put(str.charAt(i), hashmap.get(str.charAt(i))+1);
		            }else {
		            	hashmap.put(str.charAt(i), 1);
		            }
		        }
		        for(Map.Entry<Character, Integer> map:hashmap.entrySet()) {
		        	key=map.getKey();
		        	int value=map.getValue();
		        	if(value==1)
		        	{
		        		set.add(key);
		        		//return key;
		        	}
		        }
		        for(Character r:set) {
		        	System.out.println(r);
		        }
		        Iterator<Character> iter = set.iterator();
		        if(iter.hasNext()) {
		        	char co=iter.next();
		        System.out.println("iter.next()"+co);
		        
		       return co;
		        }
		        
		        	 
		      return c;
		

	}
			
}
