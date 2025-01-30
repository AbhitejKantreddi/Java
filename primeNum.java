import java.util.Scanner; // Import Scanner for user input

public class primeNum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);   // Create a Scanner object
        System.out.print("Enter a number: ");
        int n = in.nextInt();                  // Read an integer from the user
        in.close();                            // Close the scanner to prevent resource leak

        boolean ans = isPrime(n);              // Call isPrime() function
        System.out.println("Is " + n + " a prime number? " + ans);
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;  // 0 and 1 are not prime numbers

        int c = 2;
        while (c * c <= n) {       // Check divisibility up to sqrt(n)
            if (n % c == 0) return false; // If divisible, not prime
            c++;
        }

        return true;  // If no divisors found, it's prime
    }
}
