package com.mypracticeofcorejava;

public class OOPSpractise2 {
	int Uid;
	String Uname;
	static OOPSpractise2 getData(int id) {
		OOPSpractise2 obj=new OOPSpractise2();
		if(id==101) {
			obj.Uid=101;
			obj.Uname="Oxford";
		}else if(id==102) {
			obj.Uid=102;
			obj.Uname="Stanford";
		}
		return obj;
	}
	String getString() {
		return "Hello";
	}
	public static void main(String[] args) {
		
//		OOPSpractise2 obj=OOPSpractise2.getData(102);
//		here since the getData() method is static and the calling method and the caller method are in the same class we can access getData method even without using class name OOPSpractise2.getData() like that.
		OOPSpractise2 obj=getData(102);
		System.out.println(obj.Uname);
		System.out.println(obj.getString());
//		NOTE THAT HERE WE ARE STORING THE RESULT OF getData() INTO obj BUT NOTE THAT obj we created here still remains object of type OOPSpracitise2
//		and hence obj here can access instance methods of OOPSpractise2 like here it is able to access getString() method.
	}
}
