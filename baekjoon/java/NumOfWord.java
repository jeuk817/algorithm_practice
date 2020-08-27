package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumOfWord {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.println(st.countTokens());
	}
}

// 다른 코드
/*
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		int cnt = 0;
		int predecessor = ' ';
		while(true) {
			int ch = System.in.read();
			if(ch == '\n') {
				if(predecessor != ' ')	cnt++;
				break;
			}
			if(ch == ' ') {
				if(predecessor != ' ') cnt++;
			}
			predecessor = ch;
		}
		System.out.println(cnt);
	}
}
*/