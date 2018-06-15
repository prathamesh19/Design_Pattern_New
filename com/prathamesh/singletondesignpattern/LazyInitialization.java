package com.prathamesh.singletondesignpattern;

public class LazyInitialization {
	private static LazyInitialization lazyInit;
	private LazyInitialization(){
		//to restrict object creation outiside class
	}
	public static LazyInitialization getInstance(){
		if(lazyInit==null){
			lazyInit=new LazyInitialization();
		}
		return lazyInit;
	}
}
