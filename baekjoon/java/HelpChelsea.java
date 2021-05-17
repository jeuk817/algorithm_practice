package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HelpChelsea {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
	    int n =Integer.parseInt(br.readLine());

	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < n; i++) {
	    	int p =Integer.parseInt(br.readLine());
	    	int maxSal = 0;
	    	String bestPlayer = "";
	    	for(int j = 0; j < p; j++) {
	    		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    		int sal = Integer.parseInt(st.nextToken());
	    		String player = st.nextToken();
	    		if(sal > maxSal) {
	    			maxSal = sal;
	    			bestPlayer = player;
	    		}
	    	}
	    	sb.append(bestPlayer).append("\n");
	    }
	    System.out.println(sb);
	}

}
