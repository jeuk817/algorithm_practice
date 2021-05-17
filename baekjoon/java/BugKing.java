package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BugKing {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      

		StringBuilder sb = new StringBuilder();
	    String line;
	    while((line = br.readLine()) != null) {
	    	while(line.indexOf("BUG") != -1) {
	    		line = line.replace("BUG", "");
	    	}
	    	sb.append(line).append("\n");
	    }
	    System.out.println(sb);
	}

}
