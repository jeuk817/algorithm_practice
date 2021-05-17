package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
	    int n =Integer.parseInt(br.readLine());
	    
	    int[] line = new int[n];
//	    String[] lineStr = br.readLine().split(" ");
//	    for(int i = 0; i < n; i++) {
//	    	line[i] = Integer.parseInt(lineStr[i]);
//	    }
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    int index = 0;
	    while(st.hasMoreTokens()) {
	    	line[index++] = Integer.parseInt(st.nextToken());
	    }
	    Arrays.sort(line);
	    
	    int result = 0;
	    int time = 0;
	    for(int i = 0; i < n; i++) {
	    	time += line[i];
	    	result += time;
	    }
	    System.out.println(result);
	}
}
