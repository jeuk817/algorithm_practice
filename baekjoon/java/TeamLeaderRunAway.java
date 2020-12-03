package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeamLeaderRunAway {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int L = Integer.parseInt(br.readLine());
			
			System.out.println(L%5 == 0 ? L/5 : L/5 + 1);
	}

}
