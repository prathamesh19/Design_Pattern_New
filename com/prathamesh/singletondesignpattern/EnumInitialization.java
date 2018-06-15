package com.prathamesh.singletondesignpattern;

public class EnumInitialization {

	enum Student{
		ST(10,"abc");
		int value;
		String name;
		Student(int val, String nm){
			this.value=val;
			this.name=nm;
		}
		int getValue(){
			return value;
		}
		String getName(){
			return name;
		}
	}
}

