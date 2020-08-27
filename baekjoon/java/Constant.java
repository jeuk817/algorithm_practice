package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Constant {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String strN1 = st.nextToken();
		String strN2 = st.nextToken();
		String n1 = "" + strN1.charAt(2) + strN1.charAt(1) + strN1.charAt(0);
		String n2 = "" + strN2.charAt(2) + strN2.charAt(1) + strN2.charAt(0);
		if(n1.compareTo(n2) >= 0) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
		
	}
}
