package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThisSemesterSocre {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
	    int n =Integer.parseInt(br.readLine());
	    
	    float maxScore = 0;
	    float totalScore = 0;
	    for(int i = 0; i < n; i++) {
	    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    	st.nextToken();
	    	int num = Integer.parseInt(st.nextToken());
	    	float score = getScore(st.nextToken());
	    	maxScore += num;
	    	totalScore += num * score;
	    }
	    String answer = String.format("%.2f", totalScore / maxScore);
	    System.out.println(answer);
	}
	
	public static float getScore(String grade) {
		float score = 0;
		if(grade.charAt(0) == 'A') score = 4;
		else if(grade.charAt(0) == 'B') score = 3;
		else if(grade.charAt(0) == 'C') score = 2;
		else if(grade.charAt(0) == 'D') score = 1;
		else return score;
		
		if(grade.charAt(1) == '+') score += 0.3;
		else if(grade.charAt(1) == '-') score -= 0.3;
		return score;
	}
}

/*
7
General_Physics_1 3 A+
Introduction_to_Computer_Science_and_Eng 3 B0
Reading_And_Writing 2 C0
English_1 3 C+
Analytic_Geometry_and_Calculus_1 3 B+
Fortran_Programming 3 B+
C_Language_Programming 3 A+


A+: 4.3, A0: 4.0, A-: 3.7
B+: 3.3, B0: 3.0, B-: 2.7
C+: 2.3, C0: 2.0, C-: 1.7
D+: 1.3, D0: 1.0, D-: 0.7
F: 0.0
 */
