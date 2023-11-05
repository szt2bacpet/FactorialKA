public class Factorial{
    public static void main(String[] args) {
        int n = 5;
        long factorial = calculateFactorialIterative(n);
        System.out.println(n + " faktoriálisa (ciklussal): " + factorial);
    }

    public static long calculateFactorialIterative(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}

