package decorator;

public class BuyCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output;
		Car c = new Fiat500();
		c = new SunRoof(c);
		c = new GoFastStripe(c);
		
		Car d = new FiatPunto();
		d = new SunRoof(d);
		d = new GoFastStripe(d);
		
		output = c.getDescription() + "\n Total: " + c.cost();
		output += "\n\n" + d.getDescription() + "\n Total: " + d.cost();
		System.out.println(output);
	}

}
