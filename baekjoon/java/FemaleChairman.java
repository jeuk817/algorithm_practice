package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FemaleChairman {
	
	static void countResident(int k, int n) {
		int[] rooms = new int[n + 1];
		rooms[0] = 1;
		rooms[1] = 1;
		int i = 1;
		while(i <= k) {
			for(int j = 2; j < n + 1; j++) {
				if(rooms[j] == 0) rooms[j] = j;
				rooms[j] = rooms[j] + rooms[j-1];
			}
			i++;
		}
		System.out.println(rooms[n]);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			countResident(k, n);
		}
	}
}
