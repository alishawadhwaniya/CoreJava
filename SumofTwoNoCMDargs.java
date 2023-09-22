package com.mypracticeofcorejava;

public class SumofTwoNoCMDargs {
	public static void main(String[] args) {
		System.out.println(args.length);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println(a+b);
	}
}
