package com.mypracticeofcorejava;

public class FirstNonRepeatedElementinArray {
	public static void main(String[] args) {
		int arr[]= {2,3,2,1,3,6,5,4,5};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]&&i!=j) {
					count++;
					break;
				}
			}
			if(count==0) {
				
				temp++;
				if(temp==2) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
