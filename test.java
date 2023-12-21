import java.util.Scanner;

public class SecureJavaCode {
    public static void main(String[] args) {
        // Use Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your name: ");

            // Read user input and validate for potential command injection
            String name = scanner.nextLine();
            if (!isValidInput(name)) {
                System.out.println("Invalid input. Please enter a valid name.");
                return;
            }

            // Print a welcome message
            System.out.println("Hello, " + name + "! Welcome to secure Java coding.");
        } catch (Exception e) {
            // Handle exceptions, log or report as necessary
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the scanner to avoid resource leaks
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    // Validate input to prevent command injection
    private static boolean isValidInput(String input) {
        // Implement your validation logic, e.g., using regular expressions
        // This is a simple example; adjust based on your specific requirements
        return input.matches("[a-zA-Z]+");
    }
}
