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

        // 1. CWE-754: Input validation for empty or null strings
        if (!isValidInput(str1) || !isValidInput(str2)) {
            System.out.println("Error: Please provide valid non-empty input for both strings.");
            scanner.close(); // Closing the scanner before exiting
            return;
        }

        // 2. CWE-704: Use Objects.equals() for null-safe string comparison
        if (Objects.equals(str1, str4)) {
            System.out.println("str1 and str4 are equal");
        } else {
            System.out.println("str1 and str4 are not equal");
        }

        // 3. CWE-252: Check the return value of the close() method
        try {
            if (scanner != null) {
                scanner.close();
            }
        } catch (Exception e) {
            System.err.println("Error closing Scanner: " + e.getMessage());
        }

        // 4. CWE-129: Validate array index
        if (args.length > 0) {
            try {
                int index = Integer.parseInt(args[0]);
                if (index >= 0 && index < args.length) {
                    System.out.println("Value at index " + index + ": " + args[index]);
                } else {
                    System.out.println("Invalid index provided.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid index format provided.");
            }
        }

        // 5. CWE-710: Rename the method to adhere to coding standards
        // Renamed to isValidInput
    }

    // Renamed to adhere to coding standards
    private static boolean isValidInput(String input) {
        return input != null && !input.isEmpty();
    }
}
