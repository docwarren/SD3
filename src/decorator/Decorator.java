package decorator;

public abstract class Decorator extends Car{
	public Decorator(){};
	
	public abstract String getDescription();
	
	@Override
	public abstract double cost();
}
