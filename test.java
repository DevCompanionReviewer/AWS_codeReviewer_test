import java.util.Scanner;

public class StringInputHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3. Corrected the prompt for the first input
        System.out.println("Enter a string:");
        String str1 = scanner.nextLine();

        // 4. Corrected the prompt for the second input
        System.out.println("Enter another string:");
        String str2 = scanner.nextLine();

        // 5. Moved input validation to the beginning and used isValidInput method
        if (!isValidInput(str1) || !isValidInput(str2)) {
            System.out.println("Error: Please provide valid non-empty input for both strings.");
            scanner.close();
            return;
        }

        // 6. Used equals method for string comparison
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are not equal");
        }

        // 7. Wrapped array index validation and access in a try-catch block
        if (args.length > 0) {
            try {
                int index = Integer.parseInt(args[0]);

                // 8. Improved error message for invalid index format
                if (index < 0) {
                    System.out.println("Error: Please provide a non-negative integer for the array index.");
                } else if (index < args.length) {
                    System.out.println("Value at index " + index + ": " + args[index]);
                } else {
                    System.out.println("Error: Provided index is out of bounds.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid index format provided.");
            }
        }

        // 9. Close the scanner before returning
        scanner.close();
    }

    // 2. Removed the unused import statement
    // 10. Removed the unused method sanitizeInput
    // private static String getUserInput() {
    //     Scanner scanner = new Scanner(System.in);
    //     String input = scanner.nextLine();
    //     return input;
    // }

    private static boolean isValidInput(String input) {
        return input != null && !input.trim().isEmpty();
    }
}
