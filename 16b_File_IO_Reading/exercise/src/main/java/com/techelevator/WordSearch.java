package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);

		System.out.println("What is the fully qualified name of the file that should be searched?");

		// scan for the file path
		String filePath = input.nextLine();

		// create the file object from the user input in order to read the file
		File fileObject = new File(filePath);

		// prompt user to input word to be searched
		System.out.println("What is the search word you are looking for?");
		String wordToFind = input.nextLine();

		// ask the user if they want their search to be case-sensitive.
		System.out.println("Should the search be case sensitive? (Y/N)");
		String decision = input.nextLine();
		boolean isCaseSensitive = decision.equalsIgnoreCase("Y");


		// read the file in a try/catch block in order to close the file when the try block is done
		// then if the line contains the word print the line with a line number.
		int lineCounter = 0;
		try (Scanner readingInput = new Scanner(fileObject)) {
			while (readingInput.hasNextLine()) {
				String lineOfText = readingInput.nextLine();
				lineCounter++;
				String[] splitSentence = lineOfText.split(" ");
				for (String s : splitSentence) {
					if (isCaseSensitive) {
						if (s.equals(wordToFind)) {
							System.out.println(lineCounter + ") " + lineOfText);
						}
					} else {
						if (s.equalsIgnoreCase(wordToFind)) {
							System.out.println(lineCounter + ") " + lineOfText);
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found! " + fileObject.getAbsolutePath());
		}
	}}
