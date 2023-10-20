import java.util.Arrays;

public class CandidateTest {
	public static void main(String args[]) {
		int arr[]= {2,5,2,8,5};
	int array[]=	Arrays.stream(arr).distinct().toArray();
	System.out.println(array[0]);

	}
	
 

}


