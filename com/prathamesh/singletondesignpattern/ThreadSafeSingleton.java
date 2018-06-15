package com.prathamesh.singletondesignpattern;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton threadSafeInit;
	private ThreadSafeSingleton(){
		//to restrict object creation outiside class
	}
	public static synchronized ThreadSafeSingleton getInstance(){
		if(threadSafeInit==null){
			threadSafeInit =new ThreadSafeSingleton();
		}
		return threadSafeInit;
	}
}
