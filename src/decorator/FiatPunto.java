package decorator;

public class FiatPunto extends Car {

	public FiatPunto(){
		setDescription("Punto.");
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 12000.00;
	}

}
