package streams;
import java.io.*;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 2) {
			System.out.println("Usage: java FileWordCount <inputFile> <outputFile>");
			return;
		}
		String inputFile = args[0];
		String outputFile = args[1];
		Map<String, Integer> wordCount = new TreeMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
			String line;

			while ((line = reader.readLine()) != null) {
				String[] words = line.split("\\s+");
				for (String word : words) {
					if (!word.isEmpty()) {
						wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
					}
				}
			}
		} catch (IOException e) {
			System.out.println("Error reading input file: " + e.getMessage());
			return;
		}
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
			for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
				writer.write(entry.getKey() + " : " + entry.getValue());
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error writing output file: " + e.getMessage());
		}
	}

}
