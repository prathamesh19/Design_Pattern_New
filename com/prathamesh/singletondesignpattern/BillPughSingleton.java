package com.prathamesh.singletondesignpattern;

public class BillPughSingleton {

	private BillPughSingleton(){
		//to restrict object creation outiside class
	}
	private static final class InnerBillPughSingleton{
		private static final BillPughSingleton billPughSingletonInit= new BillPughSingleton();
	}
	public static BillPughSingleton getInstance(){
		return InnerBillPughSingleton.billPughSingletonInit;
	}
}
