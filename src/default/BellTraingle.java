package com.example;

public class BellTraingle {
	
	public static void main(String args[]) {
		int n=5;
		int a[][]=new int[n][n];
		a[0][0]= 1;
		System.out.println(a[0][0]);
		for(int j=1;j<n;j++){
			a[j][0]= a[j-1][j-1];
			System.out.print(a[j][0]);
			for(int i=1;i<j+1;i++){
			a[j][i]=a[j][i-1]+a[j-1][i-1];
			System.out.print("   "+a[j][i]);
			}
			System.out.println("  ");
			}
		System.out.println(a[n-1][n-1]);
	}

}
