
public class CountAndSay {

	public static void main(String[] args) {
		int n=6;
		 if(n == 1) {
			 System.out.println("1.");
		 }
	           
	        if(n == 2) {
	        	System.out.println("11..");
	        	
	        }
	        	
	        String str="11";
	        
	       for(int i=3;i<=n;i++){
 
	    	   str += '$';
	           int len = str.length();

	           int cnt = 1; // Initialize count 
	                        // of matching chars
	           String tmp = ""; // Initialize i'th 
	                            // term in series
	           char []arr = str.toCharArray();
	           
	           // Process previous term
	           // to find the next term
	           for (int j = 1; j < len; j++)
	           {
	               // If current character
	               // does't match
	               if (arr[j] != arr[j - 1])
	               {
	                   // Append count of 
	                   // str[j-1] to temp
	                   tmp += cnt + 0;

	                   // Append str[j-1]
	                   tmp += arr[j - 1];

	                   // Reset count
	                   cnt = 1;
	               }

	               // If matches, then increment 
	               // count of matching characters
	               else cnt++;
	           }

	           // Update str
	           str = tmp;
	       }

	       System.out.println(str); 
	}

}
