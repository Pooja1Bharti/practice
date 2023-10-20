
public class NumberWithEvenDigit {
	public static void main(String args[]) {
		int nums[]= {112,23,1,1,1123};
		try {
			int size=findNumber(nums);
			System.out.println(size+".......");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public static int findNumber(int[] nums) {
		int ran = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			int temp = nums[i];
			while (temp != 0) {
				temp = temp / 10;
				count++;
			}
			if (count % 2 == 0)
				ran++;

		}
		return ran;
	}

}
