import java.util.LinkedList;

public class Pallindrome {
public static void main(String args[]) {
	
	 int a=2,b=2;
	 int x=a+b;
     int i=x*x;
     
     System.out.println("result is..."+i);
}
private static void swap(int a, int c) {
int z=0;
z=c;
c=a;
a=z;
	
}
/*
 * public static boolean isPallindrome(String s) { String test=""; for(char
 * c:s.toCharArray()){ if(Character.isDigit(c) || Character.isLetter(c)){
 * test=test+c; } } int start=0; int end=test.length()-1; while(start<=end){
 * if(test.charAt(start)!=test.charAt(end)){ return false; } start++; end--; }
 * 
 * return true;
 * 
 * }
 */
}
