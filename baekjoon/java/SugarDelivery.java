package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SugarDelivery {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int quotient = n/5;
		int remainder = n%5;
		if(remainder == 0 || remainder == 3) {
			System.out.println(quotient + (remainder/3));
		} else if (quotient > 0 && (remainder == 1 || remainder == 4)) {
			System.out.println(quotient - 1 + ((remainder + 5) / 3));
		} else if(quotient > 1 && remainder == 2) {
			System.out.println(quotient + 2);
		} else {
			System.out.println(-1);
		}
	}
}
