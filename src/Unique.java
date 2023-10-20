
public class Unique {
	public static void main(String args[]) {
		String s="nl";
		String t="cx";
		boolean get=firstUniqChar(s,t);
		  System.out.println(get);
	}

    public static boolean firstUniqChar(String s,String t) {
    	int len=s.length();
    	int compare=0;
        int length=t.length();
        int count[]=new int[26];
        int cout[]=new int[26];
        if(len==length){
             for(int i=0;i<len;i++){
                int c=s.charAt(i)-'a';
                count[c]++;
             }
        for(int i=0;i<length;i++){
            int co=t.charAt(i)-'a';
            System.out.println(co+".."+cout[co]);
            cout[co]++;
            
        }
            for(int j=0;j<length;j++){
                if(cout[j]==count[j]) {
                	System.out.println(cout[j]+"...."+count[j]);
                	compare++;
                }
                   // return true;
            }
            if(compare== length) {
            	return true;
            }
        }
       
       
           return false;
    }

}


