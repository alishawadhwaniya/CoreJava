package com.mypracticeofcorejava;

public class ReverseEachWordInString {
	public static void main(String[] args) {
		String s="Hello My Friend";
		String[] str=s.split(" ");
		String reverse="";
		for(int i=0;i<str.length;i++) {
			StringBuffer sb=new StringBuffer(str[i]);
			reverse=reverse+sb.reverse().toString()+" ";
		}
		System.out.println(reverse);
	}
}
