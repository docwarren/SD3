package strategy;

public class DuckGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mallard m = new Mallard();
		RubberDuck rd = new RubberDuck();
		
		m.flyAway();
		m.quackAway();
		
		rd.flyAway();
		rd.quackAway();
	}

}
