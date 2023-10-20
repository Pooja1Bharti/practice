
public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverseInteger(1534236469));
		// TODO Auto-generated method stub

	}

	private static int reverseInteger(int x) {

		
		int temp;
		int sum = 0;
		while (x != 0) {
			temp = x % 10;

			if (sum > (Integer.MAX_VALUE/10) || sum == (Integer.MAX_VALUE/10) && temp > 7)
				return 0;
			if (sum < (Integer.MIN_VALUE/10) || sum == (Integer.MIN_VALUE/10) && temp < -8)
				return 0;

			sum = sum * 10 + temp;

			x = x / 10;
		}

		return sum;

	}

}
