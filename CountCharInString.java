package com.mypracticeofcorejava;

public class CountCharInString {
	public static void main(String[] args) {
		String s="Java";
		char ch='a';
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(count);
	}
}
