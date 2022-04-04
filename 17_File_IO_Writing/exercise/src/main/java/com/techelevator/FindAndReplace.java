package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the search word.");
        String searchWord = scan.next();

        System.out.println("Please enter the replacement word.");
        String replace = scan.next();

        System.out.println("What is the source file?");
        String sourcePath = scan.next();
        File sourceFile = new File(sourcePath);

        System.out.println("What is the destination file?");
        String destinationPath = scan.next();
        File destinationFile = new File(destinationPath);

        try (
                Scanner dataInput = new Scanner(sourceFile);
                PrintWriter dataOutput = new PrintWriter(destinationFile)
        ) {
            while (dataInput.hasNextLine()) {
                String lineOfInput = dataInput.nextLine();
                dataOutput.println(lineOfInput.replace(searchWord, replace));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Cannot open the file for writing. " + sourceFile.getAbsolutePath());
        }
    }
}