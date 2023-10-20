public class Solution {
	public static void main(String args[]) {
		int nums[]= {3,2,2,3};
		int val=3;
		removeElement(nums,val);
		
	}
    public static int removeElement(int[] nums, int val) {
      
        int count=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
        	
           if(val !=nums[i]) {
              nums[j]=nums[i];
          		System.out.println(nums[i]);
              j++;
              count++;
           }
          
        }
        for(int i=count;i<nums.length;i++)
        	nums[i]=0;
        
        System.out.println(".................................................................");
        for(int i=0;i<nums.length;i++)
        	System.out.println(nums[i]);
        
        
		return val;
        
    }
}