package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SkipLogs {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
	    int T =Integer.parseInt(br.readLine());
	    
	    StringBuilder sb = new StringBuilder();
	    while(T-- > 0) {
	    	int N =Integer.parseInt(br.readLine());
	    	int[] logs = new int[N];
	    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    	for(int i = 0; i < N; i++) {
	    		logs[i] = Integer.parseInt(st.nextToken());
	    	}
	    	sb.append(sol(logs)).append("\n");
	    }
	    System.out.println(sb);
	}

	public static int sol(int[] logs) {
		Arrays.sort(logs);
		int len = logs.length;
		int[] places = new int[len];
		int front = 0;
		int back = len - 1;
		for(int i = 0; i < len; i++) {
			int index = i % 2 == 0 ? front++ : back--;
			places[index] = logs[i];
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < len; i++) {
			int num = Math.abs(places[i] - places[i+1 == len ? 0 : i+1]);
			max = num > max ? num : max;
		}
		return max;
	}

}
