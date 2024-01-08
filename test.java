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

        // 6. Input validation for str1 and str2
        if (str1.isEmpty() || str2.isEmpty()) {
            System.out.println("Error: Please provide non-empty input for both strings.");
            scanner.close(); // Closing the scanner before exiting
            return;
        }

        // 8. No need to explicitly close the scanner in this case.

        // Using Objects.equals() for safe string equality comparison
        // 7. Add a null check for str4
        if (Objects.equals(str1, str2)) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are not equal");
        }

        // 7. Add a null check for str4
        if (Objects.equals(str1, str4)) {
            System.out.println("str1 and str4 are equal");
        } else {
            System.out.println("str1 and str4 are not equal");
        }
    }
}
