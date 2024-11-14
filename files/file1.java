package files;
import java.io.*;
import java.util.Scanner;

public class file1
 {

    public static void main(String[] args) {
        String file = "output.txt";  // Specify the file name
        Scanner inputScanner = new Scanner(System.in);

        // Asking the user for input sentences
        System.out.println("Enter multiple lines of text (Press Enter on an empty line to finish):");

        try (FileWriter writer = new FileWriter(file)) {
            String line;
            while (true) {
                line = inputScanner.nextLine();
                if (line.isEmpty()) {  // Stop when user inputs an empty line
                    break;
                }
                writer.write(line + "\n");  // Writing user input to file
            }
            System.out.println("Text written to file successfully.");
            inputScanner.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from file and counting characters, words, and sentences
        try (Scanner fileScanner = new Scanner(new File(file))) {
            int charCount = 0;
            int wordCount = 0;
            int sentenceCount = 0;

            while (fileScanner.hasNextLine()) {
                String fileLine = fileScanner.nextLine();
                charCount += fileLine.length(); // Counting characters (including spaces)
                
                // Splitting line into words and sentences
                String[] words = fileLine.split("\\s+");
                wordCount += words.length;

                String[] sentences = fileLine.split("[.!?]+");
                sentenceCount += sentences.length;
            }

            System.out.println("\nFile Analysis:");
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of sentences: " + sentenceCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
