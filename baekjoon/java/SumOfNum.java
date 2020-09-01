package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String count = br.readLine();
		String line = br.readLine();
		String[] strNums = line.split("");
		
		int sum = 0;
		for(String str: strNums) {
			sum += Integer.parseInt(str);
		}
		System.out.println(sum);
	}
}
