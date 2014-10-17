package commandPattern;

public class SteakOrder extends FoodOrder {

	public SteakOrder(Chef chef) {
		// TODO Auto-generated constructor stub
		setChef(chef);
	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		this.chef.cookThis("steak");
	}

}
