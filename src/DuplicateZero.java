
public class DuplicateZero {

	public static void main(String args[]) {

		int arr[] = {1,0,2,3,0,4,5,0};
		//1,0,2,3,0,4,5,0  0,0,0,0,0,0,0 
		duplicateZeros(arr);

	}

	public static void duplicateZeros(int[] arr) {
		int len = arr.length;
		int j = 0;
		int arry[] = new int[len];
		for (int i = 0; i < arr.length && j<len; i++,j++) {
				if (arr[i] != 0) {
					arry[j] = arr[i];
				} else {
					arry[j] = arr[i];
					if(j<len-1) {
					j++;
					arry[j] = 0;
					}
				}
			

		}
		for (int i = 0; i < len; i++)
			System.out.println(arry[i]);

	}
}
