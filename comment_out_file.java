class Test {
    static void stringEqualityCheckCompliant(String string1, String string2) {
        // Compliant: Use the equals method to compare the contents of strings.
        if (string1.equals(string2)) {
            System.out.println("The strings are equal.");
        }
    }

    public static void main(String[] args) {
        stringEqualityCheckCompliant("bisd", "bisd");
    }
}
