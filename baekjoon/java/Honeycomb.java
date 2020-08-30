package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Honeycomb {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine());
		int i = 1;
		int line = 1;
		while(true) {
			if(target <= 1 + i * (i - 1) * 6 / 2) {
				break;
			}
			line++;
			i++;
		}
		System.out.println(line);
	}

}
