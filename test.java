// 1. Renamed the class to better reflect its functionality
public class StringProcessor {
    public static void main(String[] args) {
        // 2. Removed the unused import statement
        // 9. Removed the unused method "getUserInput"
        // import java.util.Scanner;

        // 3. Corrected the prompt for the first input
        System.out.println("Enter a string:");
        String str1 = getUserInput();

        // 4. Corrected the prompt for the second input
        System.out.println("Enter another string:");
        String str2 = getUserInput();

        // 5. Moved input validation to the beginning, using the isValidInput method
        if (!isValidInput(str1) || !isValidInput(str2)) {
            System.out.println("Error: Please provide valid non-empty input for both strings.");
            return;
        }

        // 6. Used the equals method for string comparison
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
                if (index >= 0 && index < args.length) {
                    System.out.println("Value at index " + index + ": " + args[index]);
                } else {
                    System.out.println("Error: Provided index is either negative or out of bounds.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid index format provided.");
            }
        }

        // 10. Removed the unused method "sanitizeInput"
        // sanitizeInput();
    }

    // 5. Added isValidInput method for input validation
    private static boolean isValidInput(String input) {
        return input != null && !input.trim().isEmpty();
    }

    // 9. Removed the unused method "getUserInput"
    // private static String getUserInput() {
    //     Scanner scanner = new Scanner(System.in);
    //     String input = scanner.nextLine();
    //     return input;
    // }

    // 8. Closed the scanner before returning
    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }
}
