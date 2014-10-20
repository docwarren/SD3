package policy_factory;

import java.util.Random;

public class MakePolicies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolicyFactory pf = new PolicyFactory();
		Random ran = new Random();
		Policy p = pf.createPolicy(ran.nextInt(5));
		Policy r = pf.createPolicy(ran.nextInt(5));
		Policy q = pf.createPolicy(ran.nextInt(5));
		Policy z = pf.createPolicy(ran.nextInt(5));
		System.out.println("p: " + p.getPolicy());
		System.out.println("q: " + q.getPolicy());
		System.out.println("r: " + r.getPolicy());
		System.out.println("z: " + z.getPolicy());
	}
}
