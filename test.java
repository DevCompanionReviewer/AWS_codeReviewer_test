import java.util.Objects;

public class StringEqualityExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";
        String str4 = null;

        // Using Objects.equals() for safe string equality comparison
        if (Objects.equals(str1, str2)) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are not equal");
        }

        if (Objects.equals(str1, str3)) {
            System.out.println("str1 and str3 are equal");
        } else {
            System.out.println("str1 and str3 are not equal");
        }

        // Handling null values
        if (Objects.equals(str1, str4)) {
            System.out.println("str1 and str4 are equal");
        } else {
            System.out.println("str1 and str4 are not equal");
        }
    }
}
