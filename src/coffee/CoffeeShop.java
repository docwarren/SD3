package coffee;

public class CoffeeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee roast = new DarkRoast();
		roast = new Chocolate(roast);
		roast = new Milk(roast);
		roast = new Syrup(roast);
		System.out.println(roast.getDescription() + roast.cost());
		
		Coffee express = new DarkRoast();
		express = new Chocolate(express);
		express = new Milk(express);
		System.out.println(express.getDescription() + express.cost());
		
		Coffee decaf = new Decaf();
		decaf = new Milk(decaf);
		
		System.out.println(decaf.getDescription() + decaf.cost());
	}

}
