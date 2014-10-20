package Politics;

public class ConservativePolicy extends PolicyDecorator {
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
		return this.p.toString() + "\n policy of discrimination against the poor." ;
	}
	
	public ConservativePolicy(Politician p){
		setP(p);
	}

}
