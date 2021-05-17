package javaDocSearch.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HtmlParser {
	
	private ArrayList<String> tokens;
	private String currentToken = "";
	private char preChar;
	private boolean isBracket;
	
	private ArrayList<String> stack;
	private HashMap<String, Integer> wordFrequency;
	
	public HtmlParser() {
		this.currentToken = "";
		this.tokens = new ArrayList<String>();
		this.stack = new ArrayList<String>();
		this.wordFrequency = new HashMap<String, Integer>();
	}
	
	public HtmlElement getHtmlElement(File htmlFile) throws IOException {
		FileReader fr = new FileReader(htmlFile);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while((line = br.readLine()) != null) {
			this.makeTokens(line);
		}
		
		for(int i = 0; i < this.tokens.size(); i++) {
			String token = this.tokens.get(i);
			if(this.isSingleTag(token) || this.isAnnotation(token)) continue;
			if(token.startsWith("<")) {
				if(token.startsWith("<script") || token.startsWith("<style")) this.removeElement(i--);
				else if(token.startsWith("</")) this.closeTag(token);
				else this.stack.add(token);
			}
			else {
				this.stack.add(token);
			}
		}
		
		ArrayList<Entry<String, Integer>> topTen = new ArrayList<Entry<String,Integer>>();
		
		Iterator<String> words = this.wordFrequency.keySet().iterator();
		while(words.hasNext()) {
			String word = words.next();
			for(int i = 0; i < 10; i++) {
				int tenValue = topTen.get(i).getValue();
				if(tenValue)
//				if(topTen.size() > i) {
//					word
//				}
			}
		}
		
		br.close();
		return null;
	}
	
	private void makeTokens(String line) {
		for(int i = 0; i < line.length(); i++) {
			char charactor = line.charAt(i);
			if(this.isBracket && this.preChar == '<') {
				// 비교연산
				if(charactor == ' ' || charactor == '=' || charactor == '>' || charactor == '<') {
					this.currentToken = this.tokens.remove(this.tokens.size() - 1) + charactor;
					this.isBracket = false;
				}
				else {
					this.currentToken += charactor;
				}
			}
			else if(charactor == '<') {
				if(!this.currentToken.equals("")) {
					this.tokens.add(this.currentToken);
				}
				this.currentToken = "<";
				this.isBracket = true;
			}
			else if(this.isBracket && charactor == '>') {
				this.tokens.add(this.currentToken + charactor);
				this.currentToken = "";
				this.isBracket = false;
			}
			else {
				this.currentToken += charactor;
			}
			
			this.preChar = charactor;
		}
	}
	
	private boolean isSingleTag(String token) {
		String[] singleTagSigns = {
				"<?xml", "<!DOCTYPE ", "<meta ", "<link ", "<input ", "<img ", "<br", "<hr", "/>"
		};
		for(String sign: singleTagSigns) {
			if(token.indexOf(sign) != -1) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isAnnotation(String token) {
		return token.indexOf("<!--") != -1;
	}
	
	private void closeTag(String token) {
		String tag = token.substring(2, token.length() - 1);
		for(int i = this.stack.size() - 1; i >= 0; i--) {
			String currentStack = this.stack.remove(i);
			boolean isSameTag = currentStack.equals("<" + tag + ">") || currentStack.startsWith("<" + tag + " ");
			if(isSameTag) {
				break;
			}
			else {
				this.countWord(currentStack);
			}
		}
	}
	
	private void removeElement(int index) {
		while(true) {
			String token = this.tokens.remove(index);
			if(token.equals("</script>") || token.equals("</style>")) break;
		}
	}
	
	// &nbsp; &gt; &lt; a:97 z:122 A:65 Z:90
	private void countWord(String text) {
//		System.out.println(text);
		String[] specialWords = { "&nbsp;", "&gt;", "&lt;"};
		for(String str : specialWords) {
			text = text.replaceAll(str, " ");
		}
		
		String word = "";
		for(int i = 0; i < text.length(); i++) {
			char piece = text.charAt(i);
			boolean isLowerCase = piece >= 97 && piece <= 122;
			boolean isUpperCase = piece >= 65 && piece <= 90;
			if(!isLowerCase && !isUpperCase) {
				if(word.length() >= 2)
					this.recordWord(word);
				word = "";
				continue;
			}
			word += text.charAt(i);
		}
		
	}
	
	private void recordWord(String word) {
		if(this.wordFrequency.containsKey(word)) {
			this.wordFrequency.replace(word, this.wordFrequency.get(word) + 1);
		}
		else {
			this.wordFrequency.put(word, 1);
		}
	}
}
