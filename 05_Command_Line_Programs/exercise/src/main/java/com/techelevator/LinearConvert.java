package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double meters;
		double feet;
		System.out.print("Please enter the length: ");
		double length = sc.nextDouble();
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String measurementType = sc.next();

			if (measurementType.equals("f")) {
				meters = length * .3048;
				System.out.println(length + " feet is: " + meters + " meters");
			} else if (measurementType.equals("m")){
				feet = length * 3.2808399;
				System.out.println(length + " meters is: " + feet + " feet");
			}


	}

}
