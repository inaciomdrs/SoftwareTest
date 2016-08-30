package br.ufrn.imd.estrutural;

public class TriangleUtil {

	public static TriangleType determineType(int side1, int side2, int side3) {
		if (side1 <= 0 || side1 > 200) { // 1 		 
			throw new IllegalArgumentException(); // 2
		}
		if (side2 <= 0 || side2 > 200) { // 3
			throw new IllegalArgumentException(); // 4
		}
		if (side3 <= 0 || side3 > 200) { // 5
			throw new IllegalArgumentException(); // 6
		}	

		// 7
		if ((side1 >= side2 + side3) || (side2 >= side1 + side3) || (side3 >= side1 + side2)) {
			// 8
			return TriangleType.NotTriangle;
		// 9
		} else if (side1 == side2 && side2 == side3) {
			// 10
			return TriangleType.Equilateral;
		// 11
		} else if (side1 == side2 || side1 == side3 || side2 == side3) {
			// 12
			return TriangleType.Isoceles;
		// 13
		} else {
			// 14
			return TriangleType.Scalene;
		}
	}
}
