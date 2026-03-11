import java.util.Random;
import java.util.Scanner;

public class TextProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        System.out.println("Developer: Yevtushenko D.V.");


//        ЗАВДАННЯ 1

        System.out.print("\nEnter length of random number: ");
        int length = sc.nextInt();

        StringBuilder number = new StringBuilder();

//        Generating number
        for (int i = 0; i < length; i++) {
            number.append(rm.nextInt(10));
        }

        String originalNumber = number.toString();
        System.out.println("Generated number: " + originalNumber);

        char[] digits = originalNumber.toCharArray();

//        Increasing odd digits
        for (int i = 0; i < digits.length; i++) {
            int d = digits[i] - '0';

            if (d % 2 != 0) {
                if (d == 9)
                    d = 0;
                else
                    d++;

                digits[i] = (char)(d + '0');
            }
        }

//        Swapping the first and last digits
        char temp = digits[0];
        digits[0] = digits[digits.length - 1];
        digits[digits.length - 1] = temp;

        String resultNumber = new String(digits);

        System.out.println("Result after swapping: " + resultNumber);



//        ЗАВДАННЯ 2

        sc.nextLine(); // Buffer clearing

        String text = """
                Java is a powerful programming language.
                Many developers started learning Java.
                Some created advanced tools and tested code.""";

        System.out.println("\nText before processing: ");
        System.out.println(text);

        System.out.print("\nEnter a set of characters: ");
        String ending = sc.nextLine();

        System.out.print("Enter a word to insert: ");
        String insertWord = sc.nextLine();

        String[] words = text.split(" ");

        StringBuilder newText = new StringBuilder();

        for (String word : words) {
            newText.append(word);

            String cleanWord = word.replaceAll("[^a-zA-Za-яА-Я]", "");

            if (cleanWord.endsWith(ending)) {
                newText.append(" ").append(insertWord);
            }

            newText.append(" ");
        }

        System.out.println("\nText after processing:");
        System.out.println(newText);

        sc.close();
    }
}