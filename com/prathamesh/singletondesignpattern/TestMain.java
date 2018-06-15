package com.prathamesh.singletondesignpattern;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		A a = new A();
		a.loadData();
		
		//Use the clone method to get the Employee object
		A aNew = (A) a.clone();
		A aNew1 = (A) a.clone();
		List<String> list = aNew.getAList();
		list.add("John");
		List<String> list1 = aNew1.getAList();
		list1.remove("Pankaj");
		
		System.out.println("emps List: "+a.getAList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}
}
/**
 */
class A implements Cloneable{
private List<String> AList;
	
	public A(){
		AList = new ArrayList<String>();
	}
	
	public A(List<String> Alist){
		this.AList=Alist;
	}
	public void loadData(){
		//read all employees from database and put into the list
		AList.add("Pankaj");
		AList.add("Raj");
		AList.add("David");
		AList.add("Lisa");
	}
	
	public List<String> getAList() {
		return AList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getAList()){
				temp.add(s);
			}
			return new A(temp);
	}
	
}
	
