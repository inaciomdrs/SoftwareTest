package br.ufrn.imd.sequence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ISequenceTest {

	private Sequence<Integer> sequence;
	private static int MIN_VALUE = 0;
	private static int MAX_VALUE = 10;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		sequence = new Sequence<Integer>();

		for (int i = MIN_VALUE; i < MAX_VALUE; i++) {
			sequence.add(i);
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSubSequence() {
		int a, b, size;
		ISequence<Integer> newSubSequence;

		// Class 1
		a = 0;
		b = 2;
		size = sequence.subSequence(a, b).size();
		assertTrue(size == (b - a));

		// Class 1.1
		a = 0;
		b = 10;
		size = sequence.subSequence(a, b).size();
		assertTrue(size == (b - a));

		// Class 1.2
		a = 9;
		b = 10;
		size = sequence.subSequence(a, b).size();
		assertTrue(size == (b - a));

		// Class 2
		a = 2;
		b = 0;
		newSubSequence = sequence.subSequence(a, b);
		assertNull(newSubSequence);

		// Class 3
		a = 0;
		b = 0;
		size = sequence.subSequence(a, b).size();
		assertTrue(size == 0);

		// Class 3.1
		a = 5;
		b = 5;
		size = sequence.subSequence(a, b).size();
		assertTrue(size == 0);

		// Class 4
		a = -1;
		b = 1;
		newSubSequence = sequence.subSequence(a, b);
		assertNull(newSubSequence);

		// Class 5
		a = 1;
		b = -1;
		newSubSequence = sequence.subSequence(a, b);
		assertNull(newSubSequence);

		// Class 6
		a = 11;
		b = 10;
		newSubSequence = sequence.subSequence(a, b);
		assertNull(newSubSequence);

		// Class 7
		a = 10;
		b = 11;
		newSubSequence = sequence.subSequence(a, b);
		assertNull(newSubSequence);
	}

	@Test
	public void testSize() {
		assertNotNull(sequence);
		assertTrue(sequence.size() == MAX_VALUE);
	}

}
