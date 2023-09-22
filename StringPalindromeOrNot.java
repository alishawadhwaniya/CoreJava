package com.mypracticeofcorejava;

public class StringPalindromeOrNot {
	public static void main(String[] args) {
		String s="liril";
		StringBuffer sb=new StringBuffer(s);
		String rev=sb.reverse().toString();
		if(s.equals(rev)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
}
