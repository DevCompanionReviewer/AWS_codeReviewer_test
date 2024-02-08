public class RuntimeIssuesDemo {

    public static void main(String[] args) {
        // 1. ArrayIndexOutOfBoundsException
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]); // Accessing index 3, which is out of bounds

        // 2. NullPointerException
        String str = null;
        System.out.println(str.length()); // Attempting to invoke method on null reference

        // 3. ArithmeticException
        int result = 10 / 0; // Division by zero

        // 4. NumberFormatException
        String numStr = "abc";
        int num = Integer.parseInt(numStr); // Parsing a non-numeric string

        // 5. ClassCastException
        Object obj = new Integer(10);
        String strObj = (String) obj; // Attempting to cast Integer object to String

        // 6. ConcurrentModificationException
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        for (String name : names) {
            names.remove(name); // Modifying the list while iterating over it
        }

        // 7. OutOfMemoryError
        List<Integer> bigList = new ArrayList<>();
        while (true) {
            bigList.add(999999999);
        }
    }
}
