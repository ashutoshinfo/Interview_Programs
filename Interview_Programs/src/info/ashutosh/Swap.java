package info.ashutosh;

public class Swap {

	public static void main(String[] args) {
		int FirstValue = 10;
		int secondValue = 20;

		System.out.println(FirstValue + "   " + secondValue);

		FirstValue = FirstValue + secondValue;
		
		secondValue = FirstValue - secondValue;
		FirstValue = FirstValue - secondValue;

		System.out.println( "   X  " ) ;
		System.out.println(FirstValue + "   " + secondValue);

	}

}
