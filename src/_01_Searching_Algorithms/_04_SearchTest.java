package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	String[] lTest1 = {"a","b","c","d","e"};
	String[] lTest2 = {"Adam","Bob","Carl","Dylan","Evan"};
	int[] bTest1 = {3, 5, 9, 17, 30};
	int[] bTest2 = {6, 12, 14, 19, 24, 28};
	int[] iTest1 = {4, 8, 12, 16, 20, 24};
	int[] iTest2 = {7, 14, 21, 28, 35};
	
	
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
		assertEquals(1, _01_BinarySearch.binarySearch(bTest1,0,4,5));
		assertEquals(-1, _01_BinarySearch.binarySearch(bTest1,0,4,23));
		assertEquals(0, _01_BinarySearch.binarySearch(bTest2,0,5,6));
	}
	
	@Test
	public void testInterpolationSearch() {
		new _02_InterpolationSearch();
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		assertEquals(4, _02_InterpolationSearch.interpolationSearch(iTest1, 20));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(iTest1, 13));
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(iTest2, 21));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		new _03_ExponentialSearch();
		assertEquals(1, _03_ExponentialSearch.exponentialSearch(bTest1,5));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(bTest1,23));
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(bTest2,6));
	}
}
