package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class AboveAverage {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		for(int i = 0; i < len; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int scoreN = Integer.parseInt(st.nextToken());
			double[] scores = new double[scoreN];
			double sum = 0L;
			for(int j = 0; j < scoreN; j++) {
				scores[j] = Integer.parseInt(st.nextToken());
				sum += scores[j];
			}
			sum /= scoreN;
			double above = 0;
			for(int j = 0; j < scoreN; j++) {
				if(scores[j] > sum) above++;
			}
			double result = (double)above/scoreN * 100F;
			System.out.println(String.format("%.3f%%", result));
		}
	}
}
