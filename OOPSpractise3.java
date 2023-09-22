package com.mypracticeofcorejava;

public class OOPSpractise3 {
	
	int id;
	int age;
	String name;
	
	
	
	void getPersonData(OOPSpractise3[] o) {
		o[0].id=1;
		o[0].age=25;
		o[0].name="Rani";
		o[1].id=2;
		o[1].age=30;
		o[1].name="Raju";
	}
	
	static OOPSpractise3[] returnData(int id) {
		OOPSpractise3 o1=new OOPSpractise3();
		OOPSpractise3 o2=new OOPSpractise3();
		OOPSpractise3 o3=new OOPSpractise3();
		OOPSpractise3[]o= {o1,o2,o3};
		return o;
	}
	
	public static void main(String[] args) {
		OOPSpractise3[] o=returnData(1);
		OOPSpractise3 rani=new OOPSpractise3();
		OOPSpractise3 raju=new OOPSpractise3();
		OOPSpractise3[] obj= {rani,raju};
		o[0].getPersonData(obj);
		System.out.println(rani.name+"--"+raju.name);
	}
}
