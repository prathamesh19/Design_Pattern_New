package com.prathamesh.prototypedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
PizzaHut ph =new PizzaHut();
ph.loadData();
PizzaHut phnew=(PizzaHut) ph.clone();
PizzaHut phnew1=(PizzaHut) ph.clone();
List<String> list=phnew.getPizzaHutList();
list.add("coffee");
List<String> list1=phnew1.getPizzaHutList();
list1.remove("tea");
System.out.println(ph.getPizzaHutList());
System.out.println(list);
System.out.println(list1);
	}

}
class PizzaHut implements Cloneable{
	private List <String> PizzaHutList;
	public PizzaHut(){
		PizzaHutList=new ArrayList<String>();
	}
	public PizzaHut(List<String> PizzaHutList){
		this.PizzaHutList=PizzaHutList;
	}
	public void loadData(){
		PizzaHutList.add("cornpizza");
		PizzaHutList.add("cheesepizza");
		PizzaHutList.add("lemonade");
		PizzaHutList.add("tea");
	}
	public List<String> getPizzaHutList(){
		return PizzaHutList;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		List<String> temp=new ArrayList<String>();
		for(String s  : this.getPizzaHutList()){
			temp.add(s);
		}
		return new PizzaHut(temp);
	}
	
}