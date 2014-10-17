package commandPattern;

import java.util.ArrayList;

public class Waitress {
	private ArrayList<FoodOrder> orders = new ArrayList<FoodOrder>();
	
	public void addOrder(FoodOrder order){
		this.orders.add(order);;
	}
	
	public void haveBreak(){
		System.out.println("I am out by the bins having a break!");
		try{
			Thread.sleep(5000);
		}
		catch(Exception e){
			System.out.println("Error: " + e.toString());
		}
		
		System.out.println("I am back.");
	}
	
	public void giveChefOrders(){
		for(FoodOrder o: this.orders){
			o.cook();
		}
		this.orders.clear();
	}
}
