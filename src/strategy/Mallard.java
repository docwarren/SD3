package strategy;

public class Mallard extends Duck{
	public Mallard(){
		this.setFlyBehaviour(new Flies());
		this.setQuackBehaviour(new Quacks());
	}
}
