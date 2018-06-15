package com.prathamesh.singletondesignpattern;

public class StaticBlockInitialization {
	private static final StaticBlockInitialization staticBlockInit;
	static {
		staticBlockInit=new StaticBlockInitialization();
	}
	private StaticBlockInitialization(){
		//to restrict object creation outiside class
	}
	public static StaticBlockInitialization getInstance(){
		return staticBlockInit;
	}
}
