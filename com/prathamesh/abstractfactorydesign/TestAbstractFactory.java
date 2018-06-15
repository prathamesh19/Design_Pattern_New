package com.prathamesh.abstractfactorydesign;

public class TestAbstractFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaHutAbstractFactory paf=new BeveragesFactory();
		PizzaHut ph=PizzaHutFactory.getInstance(paf);
		System.out.println(ph);

	}

}
abstract class PizzaHut{
	abstract String getItem();

	@Override
	public String toString() {
		return "PizzaHut [getItem()=" + getItem() + "]";
	}
}
class Beverages extends PizzaHut{
	private String item;

	@Override
	String getItem() {
		// TODO Auto-generated method stub
		return "lemonade";
	}
}
class Eatables extends PizzaHut{
	private String item;

	@Override
	String getItem() {
		// TODO Auto-generated method stub
		return "CheesePizza";
	}
}
class PizzaHutFactory{
	public static PizzaHut getInstance(PizzaHutAbstractFactory type){
		return type.createPizzaHut();
	}
}
class BeveragesFactory implements PizzaHutAbstractFactory{
	private String item;

	@Override
	public PizzaHut createPizzaHut() {
		// TODO Auto-generated method stub
		return new Beverages();
	}

}
class EatablesFactory implements PizzaHutAbstractFactory{
	private String item;

	@Override
	public PizzaHut createPizzaHut() {
		// TODO Auto-generated method stub
		return new Eatables();
	}
}
interface PizzaHutAbstractFactory{
	public PizzaHut createPizzaHut();
}
