package commandPattern;

public class SoupOrder extends FoodOrder {

	public SoupOrder(Chef chef) {
		// TODO Auto-generated constructor stub
		setChef(chef);
	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		this.chef.cookThis("soup");
	}

}
