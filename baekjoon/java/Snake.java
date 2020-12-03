package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Snake {

	private static ArrayList<int[]> snakeBody = new ArrayList<int[]>();
	private static int[] snakeHead = {1,1};
	private static int[] snakeHeadTo = {0,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		snakeBody.add(new int[]{1,1});
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		int[][] apples = new int[K][];
		for(int i = 0; i < K; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
			apples[i] = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		}
		
		int L = Integer.parseInt(br.readLine());
		for(int i = 0; i < L; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
			int[] move = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		}
	}
	
	private static boolean moveSnake(int[] move) {
		
		return false;
	}

}
