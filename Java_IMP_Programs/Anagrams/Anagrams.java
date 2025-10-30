package Java_IMP_Programs.Anagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*

Java program to check whether two Strings are Anagrams or not

The given String is an Anagram of another String, if both Strings have same length and characters, despite of having different order.
- 'cat' and 'actt' are not anagrams
- 'caat' and 'actt' are not anagrams
- 'BAT' and 'TAB' are anagrams
- 'Bat' and 'Tab' are anagrams

Few thing to understand Anagrams in a better way:
- Number of characters in both words, after removing spaces should be same
- The count of different characters present in first word, should match with the count of them in the second word
- No need to be case sensitive

 */

public class Anagrams {
    static void Solution1(String str1, String str2) {
        // Convert strings to char array and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted char arrays
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The given strings are Anagrams.");
        } else {
            System.out.println("The given strings are not Anagrams.");
        }
    }

    static void Solution2(String str1, String str2) {
        // Implementation to check if str1 and str2 are anagrams
        if (str1.length() != str2.length()) {
            System.out.println("The given strings are not Anagrams.");
            return;
        }
        int[] charCount = new int[26]; // Assuming only lowercase a-z characters
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }
        for (int count : charCount) {
            if (count != 0) {
                System.out.println("The given strings are not Anagrams.");
                return;
            }
        }
        System.out.println("The given strings are Anagrams.");

    }

    static void Solution3(String str1, String str2) {
        Map<Character, Integer> str1Map = new HashMap<Character, Integer>();
        Map<Character, Integer> str2Map = new HashMap<Character, Integer>();

        Character ch;

        for (int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);
            if (str1Map.get(ch) == null) {
                str1Map.put(ch, 1);
            } else {
                str1Map.put(ch, str1Map.get(ch) + 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            ch = str2.charAt(i);
            if (str2Map.get(ch) == null) {
                str2Map.put(ch, 1);
            } else {
                str2Map.put(ch, str2Map.get(ch) + 1);
            }
        }
        if (str1Map.equals(str2Map)) {
            System.out.println("The given strings are Anagrams.");
        } else {
            System.out.println("The given strings are not Anagrams.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first String:");
        String str1 = scanner.nextLine();

        System.out.println("Enter second String:");
        String str2 = scanner.nextLine();

        // Preprocessing: remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Solution 1: Sorting based approach O(n log n)
        Solution1(str1, str2);

        // Solution 2: Frequency count based approach O(n)
        Solution2(str1, str2);

        // Solution 3: Using HashMap to count frequency of characters O(n)
        Solution3(str1, str2);

        scanner.close();
    }
}
