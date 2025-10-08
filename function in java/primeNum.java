public class primeNum {
    public static boolean isPrime(int n) {
        if (n <= 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimesUpTo(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is  a prime number.");
            }
        }
    }

    public static void main(String[] args) {
        printPrimesUpTo(20);
    }
}
