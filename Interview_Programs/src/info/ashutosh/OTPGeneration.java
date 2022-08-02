package info.ashutosh;

import java.util.function.Supplier;

public class OTPGeneration {
	public static void main(String[] args) {

		Supplier<String> otpGenerater = () -> {
			String oTPString = "";
			for (int i = 0; i <= 6; i++) {
				int digite = (int) (Math.random() * 6);
				oTPString = oTPString + digite;
			}
			return oTPString;
		};

		System.out.println(otpGenerater.get());
		System.out.println(otpGenerater.get());
		System.out.println(otpGenerater.get());
	}

}
