package Politics;

import static org.junit.Assert.*;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

public class PoliticianTest {

	@Test
	public void testSetName() {
		Politician p = new Politician();
		String name = "David Cameroon";
		p.setName(name);
		assertTrue(p.getName().equals(name));
	}
	@Test
	public void testSetBelief() {
		Politician p = new Politician();
		Believes b = new ConservativeBelief();
		p.setBelief(b);
		assertTrue(p.getBelief().equals(b));
	}
	@Test
	public void testSetParty() {
		Politician p = new Politician();
		String party = "Conservative Party";
		p.setParty(party);
		assertTrue(p.getParty().equals(party));
	}
	@Test
	public void testToString() {
		Politician p = new Politician();
		String name = "David Cameroon";
		p.setName(name);
		Believes b = new ConservativeBelief();
		p.setBelief(b);
		Lives l = new ConservativeLife();
		p.setLives(l);
		String party = "Conservative Party";
		p.setParty(party);
		assertTrue(p.toString().equals("David Cameroon of Conservative Party party,  lives in a big fucking house and believes that politicians know best"));
	}

}
