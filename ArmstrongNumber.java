public class ArmstrongNumber {

    public static void main(String[] args) {
        // Print all 3-digit Armstrong numbers
        System.out.println("3-digit Armstrong numbers:");
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    // Checks if a number is a 3-digit Armstrong number
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;   // Extract last digit
            sum += rem * rem * rem; // Cube the digit and add to sum
            n = n / 10;         // Remove the last digit
        }

        return sum == original; // Compare sum with original number
    }
}