package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class AlignCoordinates {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] locations = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			locations[i][0] = Integer.parseInt(st.nextToken());
			locations[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(locations, new Comparator<int[]>() {		
			@Override
			public int compare(int[] e1, int[] e2) {
				if(e1[0] == e2[0]) {		// 첫번째 원소가 같다면 두 번째 원소끼리 비교
					return e1[1] - e2[1];
				}
				else {
					return e1[0] - e2[0];
				}
			}
		});
		
		for(int[] location: locations) {
			System.out.println(location[0] + " " + location[1]);
		}
	}

	public static void _main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] locations = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			locations[i][0] = Integer.parseInt(st.nextToken());
			locations[i][1] = Integer.parseInt(st.nextToken());
		}
		
		sortLocations(locations);
		
		for(int[] location: locations) {
			System.out.println(location[0] + " " + location[1]);
		}
	}
	
	public static void sortLocations(int[][] locations) {
		for(int i = 0; i < locations.length - 1; i++) {
			for(int j = 0; j < locations.length - 1 - i; j++) {
				if(locations[j][0] > locations[j + 1][0]) {
					int[] tmp = locations[j];
					locations[j] = locations[j + 1];
					locations[j + 1] = tmp;
				} else if(locations[j][0] == locations[j + 1][0] && locations[j][1] > locations[j + 1][1]) {
					int[] tmp = locations[j];
					locations[j] = locations[j + 1];
					locations[j + 1] = tmp;
				}
			}
		}
	}

}
