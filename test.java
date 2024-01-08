import java.util.Objects;
import java.util.Scanner;

public class StringEqualityExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter another string: ");
        String str2 = scanner.nextLine();

        String str3 = "Hello";
        String str4 = null;

        // 1. CWE-754: Improper Check for Unusual or Exceptional Conditions
        if (str1.isEmpty() || str2.isEmpty()) {
            System.out.println("Please provide non-empty input.");
            scanner.close(); // Closing the scanner before exiting
            return;
        }

        // Using Objects.equals() for safe string equality comparison
        // 2. CWE-697: Incorrect Comparison
        if (Objects.equals(str1, str2)) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are not equal");
        }

        // 3. CWE-476: NULL Pointer Dereference
        if (Objects.equals(str1, str4)) {
            System.out.println("str1 and str4 are equal");
        } else {
            System.out.println("str1 and str4 are not equal");
        }

        // 4. CWE-561: Dead Code
        // Remove the scanner.close() statement, as it is not necessary here.

        // No need to explicitly close the scanner in this case.
    }
}
