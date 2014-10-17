package decorator;

public class GoFastStripe extends Decorator {
	private Car car;
	
	public GoFastStripe(Car c){
		setCar(c);
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.car.getDescription() + "\n+ gofaststripe";
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.car.cost() + 310.00;
	}

}
