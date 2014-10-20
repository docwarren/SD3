package Politics;

public class LiberalPolicy extends PolicyDecorator {
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
		return this.p.toString() + "\n free love for all." ;
	}
	
	public LiberalPolicy(Politician p){
		setP(p);
	}

}
