package com.java8.Supplier;

import java.util.function.Supplier;

public class GenerateOTP {

	public static void main(String[] args) 
	{
		Supplier<String> s = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		
		System.out.println("OTP : "+s.get());

	}

}
