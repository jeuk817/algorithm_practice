package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinaryAdd {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    
	    String binaryNum1 = st.nextToken();
	    String binaryNum2 = st.nextToken();
	    float sum = binaryToDecimal(binaryNum1) + binaryToDecimal(binaryNum2);
	    
	    String reverse = "";
		while(sum > 1) {
			reverse += sum % 2;
			sum /= 2;
		}
		reverse += "1";
		StringBuilder sb = new StringBuilder();
		for(int i = reverse.length() - 1; i >=  0; i--) {
			sb.append(reverse.charAt(i));
		}
		System.out.println(sb);
	}
	
	public static float binaryToDecimal(String binaryNum) {
		float decimal = 0;
		int len = binaryNum.length();
		for(int i = 0; i < len; i++) {
			int digit = len - i - 1;
			decimal += binaryNum.charAt(digit) == '1' ? Math.pow(2, i) : 0;
		}
		return decimal;
	}

}
