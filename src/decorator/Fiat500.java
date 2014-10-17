package decorator;

public class Fiat500 extends Car {

	public Fiat500(){
		setDescription("Fiat 500.");
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 10000.00;
	}

}
