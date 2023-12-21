public class Factorial {

    // Recursive method to calculate factorial
    public static int calculateFactorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Calculate and display the factorial of 5
        int result = calculateFactorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}
