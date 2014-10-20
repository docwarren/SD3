package Politics;

public class LabourPolicy extends PolicyDecorator {
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
		return this.p.toString() + "\n policy of increasing tax, debt and corruption." ;
	}
	
	public LabourPolicy(Politician p){
		setP(p);
	}

}
