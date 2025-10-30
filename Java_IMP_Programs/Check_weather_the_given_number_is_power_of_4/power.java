package Java_IMP_Programs.Check_weather_the_given_number_is_power_of_4;

/*
 * This program checks whether a given number is a power of 4 using multiple methods:
 * 1. Iterative Division Method
 * 2. Bitwise Method
 * 3. Logarithmic Method
 * 4. Brute-Force Method
 * Each method is implemented in a separate function, and the main method tests these functions with a sample number.
 */

public class power {
    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

    public static boolean isPowerOfFourBitwise(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n - 1) % 3 == 0;
    }

    public static boolean isPowerOfFourUsingLog(int n) {
        if (n <= 0) {
            return false;
        }
        double logResult = Math.log(n) / Math.log(4);
        return logResult == Math.floor(logResult);
    }

    public static boolean isPowerOfFourUsingBruteForce(int n) {
        if (n <= 0) {
            return false;
        }
        int power = 1;
        while (power < n) {
            power *= 4;
        }
        return power == n;
    }
    
    public static void main(String[] args) {
        int num = 64;

        // Using iterative method
        if (isPowerOfFour(num)) {
            System.out.println(num + " is a power of 4.");
        } else {
            System.out.println(num + " is not a power of 4.");
        }

        // Using bitwise method
        if (isPowerOfFourBitwise(num)) {
            System.out.println(num + " is a power of 4 (bitwise method).");
        } else {
            System.out.println(num + " is not a power of 4 (bitwise method).");
        }

        // Using logarithmic method
        if (isPowerOfFourUsingLog(num)) {
            System.out.println(num + " is a power of 4 (logarithmic method).");
        } else {
            System.out.println(num + " is not a power of 4 (logarithmic method).");
        }

        // Using brute-force method
        if (isPowerOfFourUsingBruteForce(num)) {
            System.out.println(num + " is a power of 4 (brute-force method).");
        } else {
            System.out.println(num + " is not a power of 4 (brute-force method).");
        }
    }
}
