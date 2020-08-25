package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinMax_ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int max = -1000000;
		int min = 1000000;
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if(num < min) min = num;
			if(num > max) max = num;
		}
		
		System.out.println(min + " " + max);
	}

}
