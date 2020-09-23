package baekjoon.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SortByAge {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		People[] ps = new People[num];
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			ps[i] = new People(Integer.parseInt(st.nextToken()), st.nextToken());
		}
		
		Arrays.sort(ps);
		for(People p: ps) {
			bw.append(String.valueOf(p.age));
			bw.append(" ");
			bw.append(String.valueOf(p.name));
			bw.append("\n");
		}
		bw.close();
		br.close();
	}
}

class People implements Comparable{
	public String name;
	public int age;
	public People(int age, String name) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object o) {
		People people = (People)o;
		if(this.age < people.age) {
			return -1;
		} else if(this.age == people.age) {
			return 0;
		} else {
			return 1;
		}
	}
}
