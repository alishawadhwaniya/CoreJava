package com.mypracticeofcorejava;

public class RemoveVowelsFromString {
	public static void main(String[] args) {
		String s="Hello,I love my India";
		s=s.replaceAll("[aeiouAEIOU]", "");
		System.out.println(s);
//		StringBuffer sb=new StringBuffer(s);
//		char[] vowels={'a','e','i','o','u','A','E','I','O','U'};
//		for(int i=0;i< sb.length();i++) {
//			for(int j=0;j<vowels.length;j++) {
//				if(sb.charAt(i)==vowels[j]) {
//					sb.deleteCharAt(i);
//				}
//			}
//		}
//		System.out.println(sb);
	}
}
