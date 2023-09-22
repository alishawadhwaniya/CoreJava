package com.mypracticeofcorejava;

public class ReverseString {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Java");
		System.out.println(s.reverse().toString());
		System.out.println("Without method:-");
		String str="alisha";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		String str2="Ashokit";
		StringBuffer sb=new StringBuffer(str2);
		System.out.println(sb.reverse());
	}
}
