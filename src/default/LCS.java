package com.example;

public class LCS {

	public static void main(String[] args) {

		String S1 = "ABC";
		String S2 = "ABD";

		int m = S1.length();
		int n = S2.length();

		System.out.println(lcsSolution(S1, S2, m, n));

	}

	private static char[] lcsSolution(String s1, String s2, int m, int n) {
		int dp[][] = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (s1.charAt(i - 1) == s2.charAt(j - 1))
					dp[i][j] = 1 + dp[i - 1][j - 1];
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

			}
		}

		int index = dp[m][n];
		int temp= index;
		char ch[] = new char[index + 1];
		ch[0] = '\0';
		while (m != 0 && n != 0) {
			if (dp[m][n] == Math.max(dp[m - 1][n], dp[m][n - 1])) {
				if (dp[m][n] == dp[m][n - 1]) {
					
					n--;
				}
				else
					m--;
			} else {
				//if (ch[index] != '\0') {
					ch[index] = s2.charAt(m-1);
					index--;
				//}else {
					if(index == temp)
						break;
				//}
				m--;
				n--;
			}
		}
		return ch;

	}

	private static int lcsSol(String s1, String s2, int m, int n, int[][] dp) {

		if (m == 0 || n == 0)
			return 0;

		if (dp[m][n] != -1)
			return dp[m][n];

		if (s1.charAt(m - 1) == s2.charAt(n - 1))
			dp[m][n] = 1 + lcsSol(s1, s2, m - 1, n - 1, dp);
		else
			dp[m][n] = Math.max(lcsSol(s1, s2, m - 1, n, dp), lcsSol(s1, s2, m, n - 1, dp));

		return dp[m][n];
	}

}
