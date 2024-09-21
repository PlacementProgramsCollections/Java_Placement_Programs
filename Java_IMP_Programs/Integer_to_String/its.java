package Java_IMP_Programs.Integer_to_String;

/*
Java Program to Convert Integer To String
 */

public class its {
    public static void main(String[] args) {

        /* 1st way to Convert Integer to String */
        int num1 = 456;
        String str1 = Integer.toString(num1);
        System.out.println(str1);  // Output: "456"

        /* 2nd Way */
        int num = 123;
        String str = String.valueOf(num);
        System.out.println(str);  // Output: "123"

        /* 3rd Way */
        int num2 = 789;
        String str2 = num2 + "";
        System.out.println(str2);  // Output: "789"

    }
}
