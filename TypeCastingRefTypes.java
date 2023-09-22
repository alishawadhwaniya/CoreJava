package com.mypracticeofcorejava;

class Parent{
	void show() {
		System.out.println("This is parent class method..");
	}
	void toTest() {
		System.out.println("This is to test..");
	}
}

class Child extends Parent{
	void show() {
		System.out.println("This is child class method show..");
	}
	void show1() {
		System.out.println("This is child class method show 1..");
	}
	void toCheck() {
		System.out.println("this is to check...");
	}
}

public class TypeCastingRefTypes {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.show();
		p=new Child();
		p.show();
//		p.show1();
//		p.toCheck();
		Child c=(Child)p;
		c.toTest();// this doesn't give any error cause it is a child and child can access parent class members.
		c.show1();
		c.toCheck();
		Parent pp=new Parent();  
		Child cc=(Child)pp; // here we will get classcastexception at runtime cause variable pp actually holds Parent object and it can't be cast to child.
//		that is child we can't do down casting when parent reference variable holds parent object.
		cc.toTest();
	}
}

//IMPORTANT TO NOTE:- GENERALLY WHEN THE REFERENCE VARIABLE IS OF PARENT TYPE, THE REFERENCE VARIABLE WILL BE ABLE TO ACCESS MEMBERS AND
//METHODS OF PARENT TYPE EVEN THOUGH THE OBJECT STORED IN THE REFERENCE VARIABLE IS OF CHILD....BUT WHEN THERE IS METHOD OVERRIDING LIKE HERE
//IN CASE OF show() THE CHILD CLASS SHOW() IS EXECUTED INSTEAD OF PARENT CLASS SHOW CAUSE OF METHOD OVERRIDING OTHERWISE PARENT CLASS REFERENCE VARIABLE 
//WILL BE ABLE TO ACCESS MEMBERS AND MEMBER FUNCTIONS OF PARENT CLASS ONLYYY OR ELSE WHEN YOU TRY TO ACCESS CHILD CLASS MEMBERS USING PARENT CLASS
//REFERENCE THAT HAS CHILD CLASS OBJECT STORED IN IT,EVEN THEN YOU WILL GET ERROR....THAT CAN BE SEEN FROM ABOVE COMMENTED LINES==>p.show1(),p.toCheck().
