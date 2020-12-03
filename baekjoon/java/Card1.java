package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Card1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] cards = new int[N+N];
		for(int i = 0; i < N; i++) {
			cards[i] = i + 1;
		}
		
		int topIndex = 0;
		int bottomIndex = N;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(cards[topIndex++]);
			if(i+1 != N) sb.append(" ");
			cards[bottomIndex++] = cards[topIndex++];
		}
		System.out.println(sb.toString());
	}
	
//	private static String result = "";
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
//		if(N == 1) {
//			System.out.println(1);
//			return;
//		}
//		int[] cards = new int[N];
//		for(int i = 0; i < N; i++) {
//			cards[i] = i + 1;
//		}
//		int[] remainingCards = startCardGame(cards);
//		while(true) {
//			if(remainingCards.length == 1) {
//				result += remainingCards[0];
//				break;
//			}
//			remainingCards = startCardGame(remainingCards);
//		}
//		System.out.println(result);
//	}
//	
//	private static int[] startCardGame(int[] cards) {
//		int[] remainingCards = new int[cards.length/2];
//		for(int i = 0; i < cards.length; i++) {
//			if(i%2 == 0) {
//				result += cards[i] + " ";
//			} else {
//				remainingCards[i/2] = cards[i];
//			}
//		}
//		if(cards.length%2 != 0) {
//			int tmp = remainingCards[0];
//			for(int i = 0; i < remainingCards.length - 1; i++) {
//				remainingCards[i] = remainingCards[i+1];
//			}
//			remainingCards[remainingCards.length - 1] = tmp;
//		}
//		return remainingCards;
//	}
}
