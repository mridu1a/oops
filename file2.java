import java.io.*;
import java.util.Scanner;

public class file2
 {

    public static void main(String[] args) {
        String filePath = "output.txt";  // Specify the file name
        Scanner inputScanner = new Scanner(System.in);

        // Asking the user for input sentences
        System.out.println("Enter multiple lines of text (Press Enter on an empty line to finish):");

        try (FileWriter writer = new FileWriter(filePath)) {
            String line;
            while (true) {
                line = inputScanner.nextLine();
                if (line.isEmpty()) {  // Stop when user inputs an empty line
                    break;
                }
                writer.write(line + "\n");  // Writing user input to file
            }
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from file using FileReader and directly counting characters, words, and sentences
        try (FileReader reader = new FileReader(filePath)) {
            int charCount = 0;
            int wordCount = 0;
            int sentenceCount = 0;
        
            int ch;
        

            // Read the file character by character
            while ((ch = reader.read()) != -1) {
                char currentChar = (char) ch;
                charCount++; // Count each character

                // Count words (whenever a space or newline is encountered after a word)
                if (Character.isWhitespace(currentChar) ) {
                    
                        wordCount++;
                    
                }

                // Count sentences based on punctuation marks (. ! ?)
                if (currentChar == '.' || currentChar == '!' || currentChar == '?') {
                    sentenceCount++;
                }

            }

            
           

            System.out.println("\nFile Analysis:");
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of sentences: " + sentenceCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
