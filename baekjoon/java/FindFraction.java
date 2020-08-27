package baekjoon.java;

import java.util.Scanner;

public class FindFraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		if(index == 1) {
			System.out.println("1/1");
			return;
		}
		
		int i = 2;
		while(true) {
			int d = (i*(1 + i))/2;
			if(index <= d) {
				int pr = i - 1;
				int d2 = (pr*(1 + pr))/2;
				int index2 = index - d2 -1;
				if(i%2 == 0) {
					System.out.println((1 + index2) + "/" + (i - index2));				
				} else {
					System.out.println((i - index2) + "/" + (1 + index2));
				}
				return;
			}
			i++;
		}
	}
}
