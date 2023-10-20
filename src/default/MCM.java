package com.example;

public class MCM {

	public static void main(String[] args) {
		  int arr[] = new int[] { 1, 2, 3, 4 };
	        int size = arr.length;
	 
	        System.out.println(
	            "Minimum number of multiplications is "
	            + MatrixChainOrder(arr, size));

	}

	private static int MatrixChainOrder(int[] arr, int n) {
		int dp[][]= new int[n][n];
		for(int i=0;i<n;i++)
			dp[i][i]= 0;
		int q;
		for(int l=2;l<n;l++) {
			for(int i=1;i<n-l+1;i++) {
				int j= l+i-1;
				dp[i][j]= Integer.MAX_VALUE;
				for(int k=i;k<=j-1;k++) {
					q= dp[i][k]+ dp[k+1][j]+ arr[i-1]*arr[k]*arr[j];
					
					if(q < dp[i][j] )
						dp[i][j]= q;
				}
				
			}
		}
		return dp[1][n-1];
	}

}
