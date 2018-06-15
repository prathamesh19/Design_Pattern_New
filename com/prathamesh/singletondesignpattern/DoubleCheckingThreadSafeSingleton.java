package com.prathamesh.singletondesignpattern;

public class DoubleCheckingThreadSafeSingleton {
	private static DoubleCheckingThreadSafeSingleton doubleCheckThreadSafeInit;
	private DoubleCheckingThreadSafeSingleton(){
		//to restrict object creation outiside class
	}
	public static DoubleCheckingThreadSafeSingleton getInstance(){
		if(doubleCheckThreadSafeInit==null){
			synchronized(DoubleCheckingThreadSafeSingleton.class){
			if(doubleCheckThreadSafeInit ==null){
				doubleCheckThreadSafeInit=new DoubleCheckingThreadSafeSingleton();
			}
		}
	}
		return doubleCheckThreadSafeInit;
}
	}

