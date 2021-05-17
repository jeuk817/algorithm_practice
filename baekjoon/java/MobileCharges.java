package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MobileCharges {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
	    int N =Integer.parseInt(br.readLine());
	    
	    int Y = 0;
	    int M = 0;
	    
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    while(st.hasMoreTokens()) {
	    	int second = Integer.parseInt(st.nextToken());
	    	int countY = 0;
	    	int countM = 0;
	    	if(second < 30) {
	    		countY = second > 0 ? 1 : 0;
	    	}
	    	else {
	    		int temp = second - 29;
	    		countY++;
	    		countY += temp % 30 == 0 ? temp / 30 : temp / 30 + 1;
	    	}
	    	
	    	if(second < 60) {
	    		countM = second > 0 ? 1 : 0;
	    	}
	    	else {
	    		int temp = second - 59;
	    		countM++;
	    		countM += temp % 60 == 0 ? temp / 60 : temp / 60 + 1;
	    	}
	    	
	    	Y += countY * 10;
	    	M += countM * 15;
	    }
	    System.out.println(Y < M ? "Y " + Y : Y == M ? "Y M " + Y : "M " + M);
	}

}
