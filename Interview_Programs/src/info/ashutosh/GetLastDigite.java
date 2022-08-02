package info.ashutosh;

public class GetLastDigite {
	public static void main(String[] args) {
		int input = 12345;
		while (input > 0) {
			System.out.println(input % 10);
			input = input / 10;
		}

	}

}
