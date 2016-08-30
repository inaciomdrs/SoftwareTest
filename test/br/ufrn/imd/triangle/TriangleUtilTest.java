package br.ufrn.imd.triangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufrn.imd.estrutural.TriangleType;
import br.ufrn.imd.estrutural.TriangleUtil;

public class TriangleUtilTest {
	
	@Test(expected=IllegalArgumentException.class)
	public final void testExceptionNegativeFirstSide(){
		TriangleType producedValue = TriangleUtil.determineType(-1, 10, 10);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testExceptionNegativeSecondSide(){
		TriangleType producedValue = TriangleUtil.determineType(10, -1, 10);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testExceptionNegativeThirdSide(){
		TriangleType producedValue = TriangleUtil.determineType(10, 10, -1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testExceptionNegativeFirstSecondSide(){
		TriangleType producedValue = TriangleUtil.determineType(-1, -1, 10);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testExceptionNegativeFirstThirdSide(){
		TriangleType producedValue = TriangleUtil.determineType(-1, 10, -1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testExceptionNegativeSecondThirdSide(){
		TriangleType producedValue = TriangleUtil.determineType(10, -1, -1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testExceptionNegativeAllSides(){
		TriangleType producedValue = TriangleUtil.determineType(-1, -1, -1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testExceptionSuperpositiveFirstSide(){
		TriangleType producedValue = TriangleUtil.determineType(201, 10, 10);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testExceptionSuperpositiveSecondSide(){
		TriangleType producedValue = TriangleUtil.determineType(10, 201, 10);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testExceptionSuperpositiveThirdSide(){
		TriangleType producedValue = TriangleUtil.determineType(10, 10, 201);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testExceptionSuperpositiveFirstSecondSide(){
		TriangleType producedValue = TriangleUtil.determineType(201, 201, 10);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testExceptionSuperpositiveFirstThirdSide(){
		TriangleType producedValue = TriangleUtil.determineType(201, 10, 201);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testExceptionSuperpositiveSecondThirdSide(){
		TriangleType producedValue = TriangleUtil.determineType(10, 201, 201);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testExceptionSuperpositiveAllSides(){
		TriangleType producedValue = TriangleUtil.determineType(201, 201, 201);
	}
	
	@Test
	public final void test() {
		TriangleType producedValue;
		
		/*producedValue = TriangleUtil.determineType(-1, 10, 10);
		producedValue = TriangleUtil.determineType(10, -1, 10);
		producedValue = TriangleUtil.determineType(10, 10, -1);
		
		producedValue = TriangleUtil.determineType(-1, -1, 10);
		producedValue = TriangleUtil.determineType(-1, 10, -1);
		producedValue = TriangleUtil.determineType(10, -1, -1);
		
		producedValue = TriangleUtil.determineType(-1, -1, -1);*/
		
		producedValue = TriangleUtil.determineType(10, 10, 10);
		assertEquals(TriangleType.Equilateral, producedValue);
		
		producedValue = TriangleUtil.determineType(10, 15, 10);
		assertEquals(TriangleType.Isoceles, producedValue);
		
		producedValue = TriangleUtil.determineType(15, 10, 10);
		assertEquals(TriangleType.Isoceles, producedValue);
		
		producedValue = TriangleUtil.determineType(10, 10, 15);
		assertEquals(TriangleType.Isoceles, producedValue);
		
		producedValue = TriangleUtil.determineType(9, 12, 15);
		assertEquals(TriangleType.Scalene, producedValue);
		
		producedValue = TriangleUtil.determineType(9, 3, 3);
		assertEquals(TriangleType.NotTriangle, producedValue);
		
		producedValue = TriangleUtil.determineType(3, 9, 3);
		assertEquals(TriangleType.NotTriangle, producedValue);
		
		producedValue = TriangleUtil.determineType(3, 3, 9);
		assertEquals(TriangleType.NotTriangle, producedValue);
	}
	
	

}
