import java.util.Scanner;

public class SecureJavaCode {
    public static void main(String[] args) {
        // Use Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");

        // Read user input
        String name = scanner.nextLine();

        // Print a welcome message
        System.out.println("Hello, " + name + "! Welcome to secure Java coding.");

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
