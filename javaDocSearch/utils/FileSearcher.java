package javaDocSearch.utils;

import java.io.File;
import java.util.ArrayList;

public class FileSearcher {
	
	// directory를 탐색하며 html 파일을 찾아서 반환
	public ArrayList<File> getHtmlFiles(String fileAddress) {
		ArrayList<File> htmlFiles = new ArrayList<File>();
		
		File dir = new File(fileAddress);
		String[] dirContents = dir.list();
		
		for(int i = 0; i < dirContents.length; i++) {
			File file = new File(fileAddress + "\\" + dirContents[i]);
			if(file.isDirectory()) {
//				ArrayList<File> anotherHtmlFiles = this.getHtmlFiles(file.getPath());
//				htmlFiles.addAll(anotherHtmlFiles);
			}
			else if (file.isFile()) {
				String fileName = file.getName();
				if(fileName.indexOf(".html") != -1) {
					htmlFiles.add(file);
				}
			}
		}
		return htmlFiles;
	}
	
	
}
