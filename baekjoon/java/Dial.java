package baekjoon.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dial {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String string = br.readLine();
		
		int time = 0;
		for(int i = 0; i < string.length(); i++) {
			int target = string.charAt(i);
			if(target < 68) time += 3; //abc
			else if(target < 71) time += 4; //def
			else if(target < 74) time += 5; //ghi
			else if(target < 77) time += 6; //jkl
			else if(target < 80) time += 7; // mno
			else if(target < 84) time += 8; // pqrs
			else if(target < 87) time += 9; // tuv
			else time += 10; //wxyz
		}
		bw.write(String.valueOf(time));
		bw.close();
		br.close();
	}
}
