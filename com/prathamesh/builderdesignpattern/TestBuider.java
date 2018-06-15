package com.prathamesh.builderdesignpattern;

public class TestBuider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PizzaHut ph=new PizzaHut.PizzaHutBuilder("tea", "corn").setCornPizzaAvailable(true).build();
PizzaHut ph1=new PizzaHut.PizzaHutBuilder("tea", "corn").setLemonadeAvailable(true).setCornPizzaAvailable(true).build();
System.out.println(ph);
System.out.println(ph1);
	}

}
class PizzaHut{
	private String Beverages;//mandatory
	private String Eatables;//mandatory
	private boolean isLemonadeAvailable;//optional
	private boolean isCornPizzaAvailable;//optional
	@Override
	public String toString() {
		return "PizzaHut [Beverages=" + Beverages + ", Eatables=" + Eatables + ", isLemonadeAvailable="
				+ isLemonadeAvailable + ", isCornPizzaAvailable=" + isCornPizzaAvailable + "]";
	}
	public PizzaHut(PizzaHutBuilder builder) {
		this.Beverages = builder.Beverages;
		this.Eatables = builder.Eatables;
		this.isLemonadeAvailable = builder.isLemonadeAvailable;
		this.isCornPizzaAvailable = builder.isCornPizzaAvailable;
	}
	public String getBeverages() {
		return Beverages;
	}
	public String getEatables() {
		return Eatables;
	}
	public boolean isLemonadeAvailable() {
		return isLemonadeAvailable;
	}
	public boolean isCornPizzaAvailable() {
		return isCornPizzaAvailable;
	}
	public static class PizzaHutBuilder{
		private String Beverages;//mandatory
		private String Eatables;//mandatory
		private boolean isLemonadeAvailable;//optional
		private boolean isCornPizzaAvailable;//optional
		public PizzaHutBuilder setLemonadeAvailable(boolean isLemonadeAvailable) {
			this.isLemonadeAvailable = isLemonadeAvailable;
			return this;
		}
		public PizzaHutBuilder setCornPizzaAvailable(boolean isCornPizzaAvailable) {
			this.isCornPizzaAvailable = isCornPizzaAvailable;
			return this;
		}
		public PizzaHutBuilder(String Beverages,String Eatables){
			this.Beverages=Beverages;
			this.Eatables=Eatables;
		}
		public PizzaHut build(){
			return new PizzaHut(this);
		}
		
		}
	}
	

