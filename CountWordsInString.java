package com.mypracticeofcorejava;

public class CountWordsInString {
	public static void main(String[] args) {
		String s = " I   love   java          Programming";

		int temp = 0;
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			while (i < s.length() && s.charAt(i) != ' ') {
				count++;
				i++;
			}
			if (count >= 1) {
				temp++;
			}
		}
		System.out.println("NO of words in string is " + temp);
		String[] str = s.trim().split("\\s+");
		System.out.println(
				"\\s+ is a regular expression and it considers multiple spaces as single space and splits..so No of words is "
						+ str.length);
	}
}
