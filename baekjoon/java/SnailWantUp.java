package baekjoon.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class SnailWantUp {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int top = Integer.parseInt(st.nextToken());
		
		if((top - up) % (up - down) == 0) {
			bw.write(String.valueOf((top - up) / (up - down) + 1));
		} else {
			bw.write(String.valueOf((top - up) / (up - down) + 2));			
		}
		bw.close();
		br.close();
	}
}
