package br.ufrn.imd.password;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IPasswordCheckerTest {

	private IPasswordChecker passwordChecker;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		passwordChecker = new PasswordChecker();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsStrong() {
		String strongPassword = "A1¢defgh";
		String[] weakPasswords = { "a1cdefg#", "a1cdefgh", "abcdefgh", "abc", "1bc", "1%c", "1%C" };

		assertTrue(passwordChecker.isStrong(strongPassword));
		
		for(String weakPassword : weakPasswords){
			assertFalse(passwordChecker.isStrong(weakPassword));
		}

	}

}
