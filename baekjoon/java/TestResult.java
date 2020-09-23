package baekjoon.java;

import java.util.Scanner;

public class TestResult {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String result = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "F";
		System.out.println(result);
	}
}
