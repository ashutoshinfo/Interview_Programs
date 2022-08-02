package info.ashutosh;

import java.util.Arrays;

public class BinarySearch {

	int find = 11;
	int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 101 };

	int left = 0;
	int rigth = x.length;
	int mid = x.length / 2;

	public boolean findIt() {

		System.out.println(Arrays.binarySearch(x, 3));
		return false;

	}

}

class test {
	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		binarySearch.findIt();

	}
}