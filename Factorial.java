public class Factorial {
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5; // Replace with the number for which you want to calculate the factorial
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
