package commandPattern;

public class Restaurant {
	
	public static void main(String[] args){
		Chef chef = new Chef();
		Waitress waitress = new Waitress();
		
		FoodOrder starter = new SoupOrder(chef);
		FoodOrder main = new SteakOrder(chef);
		
		waitress.addOrder(starter);
		waitress.addOrder(main);
		waitress.giveChefOrders();
	}
}
