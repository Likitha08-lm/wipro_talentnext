package streams;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file name");
		String fileName = scanner.nextLine();
		System.out.println("Enter the character to be counted");
		char targetChar = scanner.nextLine().toLowerCase().charAt(0);
		int count = 0;
		try (FileInputStream fis = new FileInputStream(fileName)) {
			int byteData;
			while ((byteData = fis.read()) != -1) {
				char ch = Character.toLowerCase((char) byteData);
				if (ch == targetChar) {
					count++;
				}
			}
			System.out.println("File '" + fileName + "' has " + count +
					" instances of letter '" + targetChar + "'.");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + fileName);
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file.");
		}

	}

}
