package decorator;

public class SunRoof extends Decorator {
	private Car car;
	
	public SunRoof(Car c){
		setCar(c);
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.car.getDescription() + "\n+ sunroof";
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.car.cost() + 650.00;
	}

}
