import java.util.Objects;
import java.util.Scanner;

public class StringInputHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter another string: ");
        String str2 = scanner.nextLine();

        // 5. Move input validation check to the beginning
        if (!isValidInput(str1) || !isValidInput(str2)) {
            System.out.println("Error: Please provide valid non-empty input for both strings.");
            scanner.close();
            return;
        }

        // 6. Use the regular string comparison operator
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are not equal");
        }

        // 8. Validate array index before accessing the array
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

        // 3. Close the scanner after obtaining input
        scanner.close();
    }

    // 4. Modify isValidInput to check for empty or null strings
    private static boolean isValidInput(String input) {
        return input != null && !input.trim().isEmpty();
    }
}
