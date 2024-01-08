import java.util.Objects;
import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter another string: ");
        String str2 = scanner.nextLine();

        String str3 = "Hello";
        String str4 = null;

        // Implement input validation for str1 and str2
        if (!isValidInput(str1) || !isValidInput(str2)) {
            System.out.println("Error: Please provide valid non-empty input for both strings.");
            scanner.close(); // Closing the scanner before exiting
            return;
        }

        // Consider using equalsIgnoreCase() for case-insensitive comparison
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("str1 and str2 are equal (case-insensitive)");
        } else {
            System.out.println("str1 and str2 are not equal (case-insensitive)");
        }

        // Add a null check for str4 before using Objects.equals()
        if (Objects.equals(str1, str4)) {
            System.out.println("str1 and str4 are equal");
        } else {
            System.out.println("str1 and str4 are not equal");
        }

        // Remove the line that calls close() on the Scanner object.
    }

    // Rename the method to adhere to coding standards
    private static boolean isValidInput(String input) {
        return input != null && !input.isEmpty();
    }
}
