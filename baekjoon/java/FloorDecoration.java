package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FloorDecoration {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int answer = 0;
		boolean[] verticals = new boolean[M];
		for(int i = 0; i < N; i++) {
			boolean hori = false;
			String line = br.readLine();
			for(int j = 0; j < M; j++) {
				if(line.charAt(j) == '-') {
					if(!hori) answer++;
					hori = true;
					verticals[j] = false;
				} else {
					if(!verticals[j]) answer++;
					hori = false;
					verticals[j] = true;
				}
			}
		}
		System.out.println(answer);
	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		int answer = 0;
//		String[] verticals = new String[M];
//		for(int i = 0; i < N; i++) {
//			String line = br.readLine();
//			answer += line.split("|").length;
//			for(int j = 0; j < M; j++) {
//				verticals[j] += line.charAt(j);
//			}
//		}
//		for(int i = 0; i < M; i++) {
//			answer += verticals[i].split("-").length;
//		}
//		System.out.println(answer);
//	}

}
