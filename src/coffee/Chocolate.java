package coffee;

public class Chocolate extends CoffeeExtra {
	Coffee cup;
	
	public Coffee getCup() {
		return this.cup;
	}

	public void setCup(Coffee cup) {
		this.cup = cup;
	}

	public Chocolate(Coffee cup){
		setCup(cup);
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.cup.getDescription() + "\n+ chocolate ";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.cup.cost() + 0.75;
	}

}
