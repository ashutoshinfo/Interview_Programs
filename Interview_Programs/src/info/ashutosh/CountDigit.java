package info.ashutosh;

public class CountDigit {

	public static void main(String[] args) {
		int numeber = 12345;

		int count = 0;
		while (numeber > 0) {

			numeber = numeber / 10;
			System.out.println(numeber);
			count++;
		}
		System.out.println(count);
	}

}
