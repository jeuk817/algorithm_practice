package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Fibonacci {

//	public ArrayList<Integer> fibo;
	
//	public Fibonacci() {
//		this.fibo = new ArrayList<Integer>();
//		this.fibo.add(0);
//		this.fibo.add(1);
//	}
	
//	public int getFibo(int n) {
//		if(n < this.fibo.size()) return this.fibo.get(n);
//		int preFibo = this.getFibo(n-1);
//		if(n - 1 == this.fibo.size()) this.fibo.add(preFibo);
//		int prepreFibo = this.getFibo(n-2);
//		
//		return preFibo + prepreFibo;
//	}
	
//	public int[] fibo;
//	
//	public Fibonacci(int n) {
//		this.fibo = new int[n + 1];
//		this.fibo[0] = 0;
//		this.fibo[1] = 1;
//	}
//	
//	public int getFibo(int n) {
//		if(n <= 1 || this.fibo[n] != 0) return this.fibo[n];
//		int preFibo = this.getFibo(n-1);
//		if(this.fibo[n-1] == 0) this.fibo[n-1] = preFibo;
//		int prepreFibo = this.getFibo(n-2);
//		
//		return preFibo + prepreFibo;
//	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] fibo = new int[n + 1];
		fibo[0] = 0;
		fibo[1] = 1;
		for(int i = 2; i < n + 1; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		System.out.println(fibo[n]);
	}
}
