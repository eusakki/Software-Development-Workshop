import java.io.*;
import java.util.Scanner;

public class LetterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Entering file names
            System.out.print("Enter path to the input file: ");
            String inputFile = sc.nextLine();

            System.out.print("Enter path to the output file: ");
            String outputFile = sc.nextLine();

            // Opening file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            String text = reader.readLine();
            reader.close();

            System.out.println("Read text: " + text);

            int[] letters = new int[26];

            text = text.toLowerCase();

            // Calculating letters
            for (char c : text.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    letters[c - 'a']++;
                }
            }

            // Opening file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            System.out.println("\nLetter frequency:");

            for (int i = 0; i < letters.length; i++) {
                if (letters[i] > 0) {
                    char letter = (char)('a' + i);
                    String result = letter + " : " + letters[i];

                    System.out.println(result);

                    writer.write(result);
                    writer.newLine();
                }
            }

            writer.close();

            System.out.println("\nResult written in file: " + outputFile);
        } catch (IOException e) {
            System.out.println("Problem with file work: " + e.getMessage());
        }

        sc.close();
    }
}