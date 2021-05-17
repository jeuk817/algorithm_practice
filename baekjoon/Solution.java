package baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
	
	public static void main(String[] args) throws IOException {
		Solution s = new Solution();
		int N = 1;
		int[] coffee_times = {100, 1, 50, 1, 1};
		int[] answer = s.solution(N, coffee_times);
//		System.out.println(s.solution(N, coffee_times));
		for(int a : answer) {
			System.out.println(a);
		}
	}
	
	private ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public int[] solution(int N, int[] coffee_times) {
		int[] answer = new int[coffee_times.length];
		int n = 0;
		int[] machine = new int[N];
		int index = 0;
		int min = 100000000;
		for(int i = 0; i < N; i++) {
			if(coffee_times[index] < min) min = coffee_times[index];
			machine[i] = index++;
			if(index == coffee_times.length) break;
		}
		
		while(n < coffee_times.length) {
			for(int i = 0; i < N; i++) {
				coffee_times[machine[i]] -= min;
				if(coffee_times[machine[i]] == 0) {
					answer[n++] = machine[i] + 1;
					if(index == coffee_times.length) continue;
					machine[i] = index++;
				}
			}
			min = 100000000;
			for(int i = 0; i < N; i++) {
				if(coffee_times[machine[i]] > 0 && coffee_times[machine[i]] < min) min = coffee_times[machine[i]];
			}
		}
		
        return answer;
    }
}