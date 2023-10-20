import java.util.Arrays;

public class Anagram {
public static void main(String args[]) {
	String s="";
	String t="anagram";
	boolean b=anag(s,t);
	System.out.println(b);
	 
}
public static boolean anag(String s,String t) {
	
	  char c[]=s.toCharArray();
      char co[]=t.toCharArray();
      Arrays.sort(c);
      Arrays.sort(co);
      int compare=0;
      if(c.length!=co.length)
          return false;
      for(int i=0;i<c.length;i++){
          if(c[i]!=co[i]){
              return false;
          }
          else{
        	 
			compare++;
             
          }
      }
      if(compare==s.length())
    	  return true;
      
      
	return false;
	
}

}
