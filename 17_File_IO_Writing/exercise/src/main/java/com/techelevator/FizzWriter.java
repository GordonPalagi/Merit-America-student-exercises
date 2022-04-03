package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.println("What is the destination file? ");
		String filePath = userInput.nextLine();
		File fileObject = new File(filePath);



		try (
				PrintWriter writingFile = new PrintWriter(new FileOutputStream(fileObject, true))
		) {
				for (int i = 1; i < 301; i++) {
					if (i % 3 == 0 && i % 5 == 0) {
						writingFile.write("FizzBuzz\n");
					}
					else if (i % 3 == 0) {
						writingFile.write("Fizz\n");
					}
					else if (i % 5 == 0) {
						writingFile.write("Buzz\n");
					}
					else {
						writingFile.write(i + "\n");
					}
				}
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	}

