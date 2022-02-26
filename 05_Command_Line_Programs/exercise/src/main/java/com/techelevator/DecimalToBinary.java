package com.techelevator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DecimalToBinary {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");


		String nums = sc.nextLine();

		String[] strNums = nums.split(" ");

		for (String strNum : strNums) {
			int intNum = Integer.parseInt(strNum);
			System.out.println(strNum + " in binary is " + Integer.toBinaryString(intNum));
		}

	}
}
