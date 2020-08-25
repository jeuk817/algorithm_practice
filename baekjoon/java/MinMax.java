package baekjoon.java;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int leng = sc.nextInt();
		int min = sc.nextInt();
		int max = min;
		for(int i = 0; i < leng -1; i++) {
			int num = sc.nextInt();
			if(num < min) {
				min = num;
			} else if(num > max) {
				max = num;
			}
		}
		System.out.println(min + " " + max);
	}

}
