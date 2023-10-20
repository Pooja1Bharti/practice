package com.example;

public class KnapsackProblem {

	public static void main(String[] args) {

		int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
    //    System.out.println(knapSack(W, weight, profit, n));
        System.out.println(knapSackSoln(W,weight,profit,n));

	}

	private static int knapSackSoln(int W, int[] wt, int[] val, int n) {
		int K[][]= new int[n+1][W+1];
		int i,w;

		for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w]
                        = max(val[i - 1]
                                  + K[i - 1][w - wt[i - 1]],
                              K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
			
		return K[n][W];
			
	
	}

	private static int max(int i, int w) {
	return 	i > w ? i : w;
		
	}

	private static int knapSack(int w, int[] weight, int[] profit, int n) {
		
		if(w==0 || n == 0)
			return 0;
		if(weight[n-1] > w)
			return knapSack(w,weight,profit,n-1);
		else
			return Math.max((profit[n-1]+ knapSack(w-weight[n-1], weight, profit, n-1)), knapSack(w, weight, profit, n-1));
		
	//	return 0;
	}

}
