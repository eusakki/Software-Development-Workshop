import java.util.Random;
import java.util.Stack;

public class StackDigits {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Random random = new Random();

        int number = 100000 + random.nextInt(900000);

        System.out.println("Generated number: " + number);

        String numStr = String.valueOf(number);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            stack.push(digit);
        }

        System.out.println("Digits added to stack.");

        System.out.print("Number in reverse order: ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println();
    }
}
