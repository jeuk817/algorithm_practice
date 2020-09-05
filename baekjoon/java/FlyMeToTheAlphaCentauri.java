package baekjoon.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FlyMeToTheAlphaCentauri {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int len = - Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			int n = 1;
			while(true) {
				int ari = n * (2 * n + 2) / 2;
				if(len <= ari) {
					int preAri = (n - 1) * (2 * n) / 2;
					if((len - preAri) - n > 0) {
						n *= 2;
					} else { 
						n = n * 2 - 1;
					}
					break;
				}
				n++;
			}
			bw.write(String.valueOf(n) + "\n");
		}
		bw.close();
		br.close();
	}
/*
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int len = - Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			int n = 1;
			while(true) {
				int ari = n * (2 * n + 2) / 2;
				if(len <= ari) {
					int preAri = (n - 1) * (2 * n) / 2;
					if((len - preAri) - n > 0) {
						n *= 2;
					} else { 
						n = n * 2 - 1;
					}
					break;
				}
				n++;
			}
			System.out.println(n);
		}
		br.close();
	}
*/
}
