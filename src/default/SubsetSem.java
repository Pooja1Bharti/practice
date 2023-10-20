package com.example;

public class SubsetSem {

	public static void main(String[] args) {
		int subset[]= {3, 34, 4, 12, 5, 2};
		int sum=9;
		
		//System.out.println(subsetProblem(subset,sum));
		if(subsetSumDynamicProgramming(subset, subset.length, sum) != 0)
		System.out.println("true");
		else
			System.out.println("false");

	}
private static int subsetSumDynamicProgramming(int[] subset, int n, int sum) {
		int dp[][]=new int[n+1][sum+1];
		
		
		for(int i=1;i<= n;i++) {
			for(int j=1;j<=sum;j++) {
				dp[i][j]=-1;
			}
		}
		
		if(sum == 0)
			return 1;
		if(n <= 0)
			return 0;
		System.out.println(n+"  ....."+dp[n - 1][sum]);	
		 if (dp[n - 1][sum] != -1) {
			 System.out.println(dp[n-1][sum]);
	            return dp[n - 1][sum];
	            }

		if(subset[n-1]> sum)
			return dp[n-1][sum]= subsetSumDynamicProgramming(subset, n-1, sum);
		else {
			
		if(subsetSumDynamicProgramming(subset, n-1, sum) !=0 || 
					subsetSumDynamicProgramming(subset, n-1, sum-subset[n-1]) !=0)
			 	return dp[n-1][sum]= 1;
		else 
			return dp[n-1][sum]= 0;
		}
	}
//normal approach
	private static boolean subsetProblem(int[] subset, int sum) {
		if(subset.length==0 && sum == 0)
			return true;
		
		if(subset.length==0 && sum>0)
			return false;
		
		for(int i=0;i<subset.length;i++) {
			for(int j=i+1;j<subset.length;j++) {
				
				if(sum-(subset[i]+subset[j]) == 0)
					return true;
				
			}
		}
		return false;
		
	}

}
