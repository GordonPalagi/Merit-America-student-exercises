package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 1;
		int num3 = 1;

		System.out.print("Enter a number: ");
		int fibTarget = sc.nextInt();

		System.out.print(num1 + " ");

		for (int i = 1; i <= fibTarget; i++) {
			while (num3 <= fibTarget) {
				System.out.print(num3 + " ");
				num3 = num1 + num2;
				num1 = num2;
				num2 = num3;
			}
		}
	}
	}



