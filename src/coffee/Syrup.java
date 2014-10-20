package coffee;

public class Syrup extends CoffeeExtra {
	Coffee cup;
	
	public Coffee getCup() {
		return this.cup;
	}

	public void setCup(Coffee cup) {
		this.cup = cup;
	}

	public Syrup(Coffee cup){
		setCup(cup);
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.cup.getDescription() + "\n+ syrup ";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.cup.cost() + 0.50;
	}

}
