import java.util.Scanner;

public class SecureInputExample {

    public static void main(String[] args) {
        // Use a secure method for user input
        String userInput = getUserInput("Enter your name: ");

        // Print the sanitized user input
        System.out.println("Hello, " + sanitizeInput(userInput) + "!");
    }

    // A secure method for getting user input
    private static String getUserInput(String prompt) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(prompt);

        // Use nextLine() instead of next() to capture entire input line
        String input = scanner.nextLine();

        // Close the scanner to prevent resource leaks
        scanner.close();

        return input;
    }

    // A secure method for sanitizing user input
    private static String sanitizeInput(String input) {
        // Use a regex or other appropriate method to sanitize input
        // In this example, only alphanumeric characters are allowed
        return input.replaceAll("[^a-zA-Z0-9]", "");
    }
}