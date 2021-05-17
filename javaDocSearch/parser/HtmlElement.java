package javaDocSearch.parser;

import java.util.ArrayList;

public class HtmlElement {
	private String type;
	private String value;
	private ArrayList<HtmlElement> subElements;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public ArrayList<HtmlElement> getSubElements() {
		return subElements;
	}
	public void setSubElements(ArrayList<HtmlElement> subElements) {
		this.subElements = subElements;
	}
	
}
