import java.util.Objects;
import java.util.Scanner;

public class StringComparisonProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter another string: ");
        String str2 = scanner.nextLine();

        String str3 = "Hello";
        String str4 = null;

        // 2. CWE-15: Implement input validation
        if (!isValidInput(str1) || !isValidInput(str2)) {
            System.out.println("Error: Please provide valid non-empty input for both strings.");
            scanner.close(); // Closing the scanner before exiting
            return;
        }

        // 3. CWE-704: Use the equals() method of the String class
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are not equal");
        }

        // 4. CWE-476: Add a null check for str4
        if (Objects.equals(str1, str4)) {
            System.out.println("str1 and str4 are equal");
        } else {
            System.out.println("str1 and str4 are not equal");
        }

        // 5. CWE-561: Remove unnecessary line that closes the Scanner object.
    }

    // 1. CWE-710: Rename the class to adhere to coding standards
    private static boolean isValidInput(String input) {
        return input != null && !input.isEmpty();
    }
}
