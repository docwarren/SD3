package Politics;

public class GreenPolicy extends PolicyDecorator {
	private Politician p;
	
	public Politician getP() {
		return this.p;
	}

	public void setP(Politician p) {
		this.p = p;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.p.toString() + "\n policy of allowing interspecies marriage." ;
	}
	
	public GreenPolicy(Politician p){
		setP(p);
	}

}
