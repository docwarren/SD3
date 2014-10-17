package commandPattern;

import java.util.ArrayList;

public class Waitress {
	private ArrayList<FoodOrder> orders = new ArrayList<FoodOrder>();
	
	public void addOrder(FoodOrder order){
		this.orders.add(order);;
	}
	
	public void giveChefOrders(){
		for(FoodOrder o: this.orders){
			o.cook();
		}
	}
}
