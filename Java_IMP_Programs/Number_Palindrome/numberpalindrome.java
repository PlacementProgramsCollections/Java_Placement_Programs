package Java_IMP_Programs.Number_Palindrome;

/*
 * Java program to check whether the given integer text is a Palindrome
 */

public class numberpalindrome {
    public static void firstway() {
        int n = 1212;
        String str = Integer.toString(n);

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }

    public static void secondway() {
        int originalNum = 121;

        int num = originalNum;
        int reversedNum = 0;
        int reminder;

        while (num > 0) {
            reminder = num % 10;
            num = num / 10;
            reversedNum = reversedNum * 10 + reminder;
        }

        if (reversedNum == originalNum) {
            System.out.println("Given number is a palindrome");
        } else {
            System.out.println("Given number is not a palindrome");
        }
    }

    public static void main(String[] args) {
        firstway();
        secondway();
    }
}
