package info.ashutosh;;

public class Factoriol {

	public static void main(String[] args) {
		int input = 5;
		int multiplication = 1;

		for (int i = 1; i <= input; i++) {
			multiplication = multiplication * i;
		}
		System.out.println(multiplication);
	}

}
