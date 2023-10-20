
public class StringToInteger {
	
	public static void main(String args[]) {
		String s="67898 427";
		String str=" Hello World ";
		System.out.println("trim.."+str.trim());
		char ch[]=s.toCharArray();
		int sum=0;
		//while()
		for(int i=0;i<ch.length;i++) {
			
			 //num=s.charAt(i);
			int digit = s.charAt(i) - '0';
			if(digit<=Integer.MAX_VALUE/10 && digit>=Integer.MIN_VALUE/10)
			{		
			System.out.println("digit "+digit);
		if(digit>=0 && digit<=9) {
			// System.out.println(num+".."+s.charAt(i));
			sum=sum * 10 + digit;
			 System.out.println("..."+sum);
		}
		else 
			break;
		
		}
		}
		System.out.println(sum+"..");
				
	}
}
