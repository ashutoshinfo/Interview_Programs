package info.ashutosh;

public class Prime {

	// TODO : check Prime Number Service
	public boolean checkPrimeNumberService(int input) {

		if (isZeroOrOne(input)) {
			System.out.println("Please Enter Valid Input ! \n(note : Input must not be 0 or 1.)");
			return false;
		} // if

		if (isPrime(input)) {
			System.out.println("Prime !");
			return true;
		} else {
			System.out.println("Not Prime !");
			return false;
		} // if-else
	}// checkPrimeNumberService()

	// TODO check is 0 or 1
	private Boolean isZeroOrOne(int input) {
		if (input == 0 || input == 1) {
			return true;
		}
		return false;
	}// isValidInput()

	// TODO check is Prime Or not
	private boolean isPrime(int input) {
		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}// isPrime()

}// Prime class

class TestingPrime2 {
	public static void main(String[] args) {
		Prime prime2 = new Prime();
		prime2.checkPrimeNumberService(5);

	}// main
}// TestingPrime class
