package streams;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Step 1: Get file name
		System.out.println("Enter the file name:");
		String fileName = scanner.nextLine();

		// Step 2: Get character to be counted
		System.out.println("Enter the character to be counted:");
		char ch = scanner.nextLine().toLowerCase().charAt(0); // Case insensitive
		int count = 0;
		try {
			FileReader fr = new FileReader(fileName);
			int data;
			while ((data = fr.read()) != -1) {
				char currentChar = Character.toLowerCase((char) data);
				if (currentChar == ch) {
					count++;
				}
			}
			fr.close();
			System.out.println("File '" + fileName + "' has " + count +
					" instances of letter '" + ch + "'.");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + fileName);
		} catch (IOException e) {
			System.out.println("Error reading the file.");
		}

	}

}
