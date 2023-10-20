public class StringTest {
	public static void main(String args[]) {
		int arrs[]= {-2,-3,4,-1,-2,5,-3};
		int sums=0;
		int str=0;
		int start=0;
		int en=0;
				
		int max_sum=Integer.MIN_VALUE;
		for(int i=0;i<arrs.length;i++) {
			sums= sums+arrs[i];
			if(max_sum < sums) {
				max_sum= sums;
				start=str;
				en= i;
			}
			if(max_sum < 0) {
				str= i+1;
				max_sum= 0;
			}
		}
		System.out.println(max_sum+" start"+start+" end .."+en);
		
		String sello="Hello world";
		String s="";
		for(int i=0;i<sello.length();i++) {
			char c=s.charAt(i);
			if((c>='a' && c<= 'z') || (c>= 'A' && c<= 'Z') || (c >=0 && c<=9)) {
				if(c>='A' && c<= 'Z') {
					s=s+(char)c+32;
				}
				else
					s=s+c;
			}else {
				continue;
			}
			s=s+sello.charAt(i);
			System.out.println(s);
		}
		
		
		
		
		
		
	int digit= 142454;
	int k=4;
	int count=0;
	while(digit>0) {
		int temp= digit%10;
		if(temp == k)
			count++;
	 digit=digit/10;
	
	 System.out.println(digit);
	//count++;
	
	}
	System.out.println(count);
	
	}
	

}
