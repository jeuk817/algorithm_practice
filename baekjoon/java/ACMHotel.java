package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACMHotel {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		for(int i = 0; i < caseNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			if(n%h == 0) {
				System.out.println(h*100 + (n/h));
			} else {
				System.out.println(n%h*100 + (n/h + 1));
			}
		}
	}
}


/*
String result="";
		for(int i = 0; i < caseNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			if(n%h == 0) {
				result += h + "0" + (n/h) + "\n";
			} else {
				result += n%h + "0" + (n/h + 1) + "\n";
			}
		}
		System.out.println(result);
*/


/*
String line="";
		while((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line, " ");
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			System.out.println(n%h + "0" + (n/h + 1));
		}
*/