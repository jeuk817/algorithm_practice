package baekjoon.java;

public class SumOfN {
	long sum(int[] a) {
		long sum = 0;
		for(int num: a) {
			sum += num;
		}
		return sum;
	}
}
