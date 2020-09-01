package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatianAlphabet {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = br.readLine();
		int len = sentence.length();
		int numOfAlphabet = 0;
		
		for(int i = 0; i < len; i++) {
			char token = sentence.charAt(i);
			if(token == 'c') {
				if(i + 1 < len && (sentence.charAt(i + 1) == '=' || sentence.charAt(i + 1) == '-')) i++;
			}
			else if(token == 'd') {
				if(i + 2 < len && sentence.charAt(i + 1) == 'z' && sentence.charAt(i + 2) == '=') i += 2;
				else if(i + 1 < len && sentence.charAt(i + 1) == '-') i++;
			}
			else if(token == 'l' || token == 'n') {
				if(i + 1 < len && sentence.charAt(i + 1) == 'j') i++;
			}
			else if(token == 's' || token == 'z') {
				if(i + 1 < len && sentence.charAt(i + 1) == '=') i++;
			}
			numOfAlphabet++;
		}
		System.out.println(numOfAlphabet);
	}
}
