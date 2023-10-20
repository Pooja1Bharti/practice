import java.util.Arrays;

public class IfDoubleExist {
	public static void main(String args[]) {
		int arr[]= {-10,12,-20,-8,15};
		try {
			System.out.println("entring");
			boolean check=checkIfExist(arr);
			System.out.println(check);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static boolean checkIfExist(int[] arr) {
		int k=0;
		for(int i:arr)
			{
			if(i<0) {
				System.out.println(Math.abs(i));
				
				arr[k]=Math.abs(i);
				k++;
				
			}	
			else {
				arr[k]=i;
				k++;
			}
				
			
			}
		Arrays.sort(arr);
		for(int l:arr)
			System.out.println(l);
		boolean b=false;
	    for(int i=0;i<arr.length;i++){
	        int n=arr[i]*2;
	        for(int j=1;j<arr.length;j++)
	        {
	        	if(arr[j]==n)
	        	return true;
	        }
	    }
		return false;
	    

}
}

    

