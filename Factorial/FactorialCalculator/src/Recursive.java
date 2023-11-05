public class Recursive {
    public static void main(String[] args) {
        int n = 5;
        long factorial = calculateFactorialRecursive(n);
        System.out.println(n + " faktoriálisa (rekurzív): " + factorial);
    }

    public static long calculateFactorialRecursive(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorialRecursive(n - 1);
        }
    }
}