package com.prathamesh.singletondesignpattern;

public class EagerInitialization {
	private static final EagerInitialization eagerInit = new EagerInitialization();
	/*@Override
	public String toString() {
		return "EagerInitialization [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}*/
	private EagerInitialization(){
		//to restrict object creation outiside class
	}
	public static EagerInitialization getInstance(){
		return eagerInit;
	}
}
