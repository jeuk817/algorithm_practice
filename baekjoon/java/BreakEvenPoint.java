package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class BreakEvenPoint {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int profit = -Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		
		if(profit <= 0) {
			System.out.println(-1);
		} else {
			System.out.println(A/profit + 1);
		}
	}
}
