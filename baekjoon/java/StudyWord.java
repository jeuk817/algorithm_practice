package baekjoon.java;

import java.util.Scanner;

public class StudyWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine().toUpperCase();
		int[] count = new int[26];
		int max = 0;
		char result = '?';
		
		for(int i = 0; i < string.length(); i++) {
			int index = string.charAt(i) - 65;
			count[index] += 1;
			if(max == count[index]) {
				result = '?';
			} else if(max < count[index]) {
				max = count[index];
				result = (char)(index + 65);
			}
		}
		System.out.println(result);
	}
}
