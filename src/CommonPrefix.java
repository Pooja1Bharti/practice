
public class CommonPrefix {

	public static void main(String args[]) {
		String arr[]= {"Helle","Hee","Hel"};
		if(arr.length==0) {
			System.out.println("");
		}
		
			String prefix=arr[0];
			
			
			for(int i=1;i<arr.length;i++) {
				while(arr[i].indexOf(prefix)!=0) {
					prefix=prefix.substring(0, prefix.length()-1);
				}
			}
		System.out.println(prefix);
	}
}
