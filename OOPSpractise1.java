package com.mypracticeofcorejava;

public class OOPSpractise1 {
	Person getData(int id) {
		Person p = new Person();

		if (id == 101) {

			p.age = 30;
			p.name = "Raju";

		} else if (id == 102) {
			p.age = 32;
			p.name = "Rani";
		}
		return p;
	}

	public static void main(String[] args) {
		OOPSpractise1 d = new OOPSpractise1();
		Person p = d.getData(102);
		System.out.println(p.age + "--" + p.name);
	}
}

class Person {
	int id;
	int age;
	String name;
}