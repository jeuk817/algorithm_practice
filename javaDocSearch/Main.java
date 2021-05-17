package javaDocSearch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javaDocSearch.parser.HtmlElement;
import javaDocSearch.parser.HtmlParser;
import javaDocSearch.utils.FileSearcher;

public class Main {
	private static final String LOOT_FILE_ADDRESS = "C:\\Users\\macho\\Desktop\\study\\javaDoc\\jdk-8u291-docs-all\\docs";

	public static void main(String[] args) {
		System.out.println("start");
		
		FileSearcher fileSearcher = new FileSearcher();
		ArrayList<File> htmlFiles = fileSearcher.getHtmlFiles(LOOT_FILE_ADDRESS);
//		HtmlParser htmlParser = new HtmlParser();
		
		try {
			
//			for(int i = 0; i < htmlFiles.size(); i++) {
//				File htmlFile = htmlFiles.get(i);
//				HtmlParser htmlParser = new HtmlParser();
//				HtmlElement html = htmlParser.getHtmlElement(htmlFile);
//			}
			File htmlFile = htmlFiles.get(0);
			HtmlParser htmlParser = new HtmlParser();
			HtmlElement html = htmlParser.getHtmlElement(htmlFile);
			
			System.out.println("end");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
