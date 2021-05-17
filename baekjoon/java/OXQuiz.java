package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OXQuiz {

	public static void main(String[] args) throws IOException { // 79, 88
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < caseNum; i++) {
			String result = br.readLine();
			int sum = 0;
			int count = 0;
			for(int j = 0; j < result.length(); j++) {
				if(result.charAt(j) == 88) { // X
					count = 0;
					continue;
				}
				sum += ++count;
			}
			sb.append(sum + "\n");
		}
		System.out.println(sb);
	}

}
