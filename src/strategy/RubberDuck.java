package strategy;

public class RubberDuck extends Duck{
	public RubberDuck(){
		this.setFlyBehaviour(new LandBound());
		this.setQuackBehaviour(new Squeaks());
	}
}
