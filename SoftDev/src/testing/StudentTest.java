package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testSetMatricNo() {
		Student s = new Student();
		String matricNo = "40070670";
		s.setMatricNo(matricNo);
		String actual, expected;
		
		expected = matricNo;
		actual = s.getMatricNo();
		assertTrue(actual.equals(expected));
		
	}

}
