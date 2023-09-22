package com.mypracticeofcorejava;

import java.util.Arrays;

public class StringsAnagramsOrNot {
	public static void main(String[] args) {
//		if all the characters of one string are present in other string then the two strings are anagrams.
		String s1="book";//ashok
		String s2="bomb";//kosha
		if(s1.length()!=s2.length()) {
			System.out.println("Not anagrams");
			return;
		}
		int count=0;
		for(int i=0;i<s1.length();i++) {
			boolean b=false;
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					b=true;
					break;
				}
			}
			if(b==true) {
				count++;
			}
		}
		if(count==s1.length()) {
			System.out.println("Anagrams");
		}else {
			System.out.println("Not Anagram");
		}
		
//		OTHER APPROACH
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.equals(a, b));//equals returns a boolean value and checks if both the arrays are equals.
	}
}
