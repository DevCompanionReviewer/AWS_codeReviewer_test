import java.util.Scanner;

public class StringProcessor {
    public static void main(String[] args) {
        // 1. CWE-15: External Control of System or Configuration Setting
        validateAndSanitizeArguments(args);

        // 2. CWE-476: NULL Pointer Dereference
        String userInput = getUserInput();
        if (userInput != null) {
            try {
                // 3. CWE-252: Unchecked Return Value
                int index = Integer.parseInt(userInput);

                // 4. CWE-682: Incorrect Calculation
                if (isValidIndex(index, args.length)) {
                    System.out.println("Value at index " + index + ": " + args[index]);
                } else {
                    System.out.println("Error: Provided index is either negative or out of bounds.");
                }
            } catch (NumberFormatException e) {
                // 3. CWE-252: Unchecked Return Value
                System.out.println("Error: Invalid index format provided.");
            }
        } else {
            System.out.println("Error: Invalid user input.");
        }

        // 5. CWE-561: Dead Code
        // Dead code removed
    }

    private static void validateAndSanitizeArguments(String[] args) {
        // Add validation and sanitization logic for command-line arguments
        if (args.length > 0) {
            System.out.println("Provided arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an index:");
        return scanner.nextLine();
    }

    private static boolean isValidIndex(int index, int arrayLength) {
        // Validate the index to prevent out-of-bounds errors
        return index >= 0 && index < arrayLength;
    }
}
