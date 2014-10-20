package coffee;

public class Espresso extends Coffee {
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 2.00;
	}
	
	public Espresso(){
		setDescription("Espresso ");
	}
}
