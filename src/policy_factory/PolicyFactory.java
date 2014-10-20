package policy_factory;

public class PolicyFactory {
	Policy p;
	
	public Policy createPolicy(int index){
		if(index == 5) this.p = new ConservativePolicy();
		else if(index == 1) this.p = new LabourPolicy();
		else if(index == 2) this.p = new GreenPolicy();
		else if(index == 3) this.p = new BouncyBouncyPolicy();
		else if(index == 4) this.p = new BingoBongoPolicy();
		else this.p = new LibPolicy();
		return this.p;
	}
	
}
