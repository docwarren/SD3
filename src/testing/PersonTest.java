package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testHappyBirthday() {
		Person p = new Person();
		int age = 40;
		p.setAge(age);
		p.happyBirthday();
		
		int actual, expected;
		actual = p.getAge();
		expected = age + 1;
		
		assertTrue(actual == expected);
	}

	@Test
	public void testSetAge() {
		Person p = new Person();
		int age = 21;
		
		p.setAge(age);
		int actual, expected;
		actual = p.getAge();
		expected = age;
		
		assertTrue(actual == expected);
	}

}
