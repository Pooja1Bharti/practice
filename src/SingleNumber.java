import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public static void main(String[] args) {

		int nums[] = { 1, 1, 3, 1};
		Map<Integer, Integer> map = new HashMap<>();
		
	int data=	Arrays.stream(nums).reduce(
				0,(a,b)-> a^b);
		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			
			
		}
	}

}
