package coffee;

public class Milk extends CoffeeExtra {
	Coffee cup;
	
	public Coffee getCup() {
		return this.cup;
	}

	public void setCup(Coffee cup) {
		this.cup = cup;
	}

	public Milk(Coffee cup){
		setCup(cup);
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.cup.getDescription() + "\n+ milk ";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.cup.cost() + 0.25;
	}

}
