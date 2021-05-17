package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plus123 {

	public static void main(String[] args) throws IOException {
		int[] dp = new int[11];
		dp[0] = 1;
		dp[1] = 2;
		dp[2] = 4;
		for(int i = 3; i < 11; i++) {
			dp[i] = dp[i-3] + dp[i -2] + dp[i-1];
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < caseNum; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(dp[n-1]);
		}
	}

}
