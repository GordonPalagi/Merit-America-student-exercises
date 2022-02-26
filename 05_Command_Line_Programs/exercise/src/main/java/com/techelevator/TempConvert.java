package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double convertToFahrenheit;
		double convertToCelcius;
		System.out.print("Please enter the temperature: ");
		int temperature = sc.nextInt();
		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		String tempType = sc.next();

		if (tempType.equalsIgnoreCase("c")) {
			convertToFahrenheit = (temperature * 1.8) + 32;
			System.out.print(temperature + " Celcius is " + convertToFahrenheit + " Fahrenheit");
		} else if (tempType.equalsIgnoreCase("f")){
			convertToCelcius = (temperature - 32) / 1.8;
			System.out.print(temperature + " Fahrenheit is " + convertToCelcius + " Celsius");
		}


	}

}
