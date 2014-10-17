package strategy;

public class Duck{
	
	private Flying flyBehaviour;
	private Quacking quackBehaviour;
	
	public void flyAway(){
		this.flyBehaviour.fly();
	}
	
	public void quackAway(){
		this.quackBehaviour.quack();
	}
	
	public Flying getFlyBehaviour() {
		return flyBehaviour;
	}

	public void setFlyBehaviour(Flying flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public Quacking getQuackBehaviour() {
		return quackBehaviour;
	}

	public void setQuackBehaviour(Quacking quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public Duck(){
		
	}
	
}
