package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Average {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
	    int N =Integer.parseInt(br.readLine());
	    
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    float[] scores = new float[N];
	    float max = 0;
	    for(int i = 0; i < N; i++) {
	    	scores[i] = Float.parseFloat(st.nextToken());
	    	max = scores[i] > max ? scores[i] : max;
	    }

	    float total = 0.0f;
	    for(int i = 0; i < N; i++) {
	    	total += scores[i] / max * 100;
	    }
	    System.out.println(total / N);
	}

}
