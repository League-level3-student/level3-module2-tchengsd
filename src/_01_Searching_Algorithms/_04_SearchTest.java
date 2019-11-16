package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	String[] lTest1 = {"a","b","c","d","e"};
	String[] lTest2 = {"Adam","Bob","Carl","Dylan","Evan"};
	int[] bTest1 = {3, 5, 9, 17, 30};
	int[] bTest2 = {6, 12, 14, 19, 24};
	
	
	@Test
	public void testLinearSearch() {
		new _00_LinearSearch();
		//1. use the assertEquals method to test your linear search method.
		assertEquals(3, _00_LinearSearch.linearSearch(lTest1,"d"));
		assertEquals(-1, _00_LinearSearch.linearSearch(lTest1,"g"));
		assertEquals(4, _00_LinearSearch.linearSearch(lTest2,"Evan"));
	}

	@Test
	public void testBinarySearch() {
		new _01_BinarySearch();
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		assertEquals(2, _01_BinarySearch.binarySearch(bTest1,0,40,5));
		assertEquals(-1, _01_BinarySearch.binarySearch(bTest1,0,40,23));
		assertEquals(0, _01_BinarySearch.binarySearch(bTest2,0,40,6));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
