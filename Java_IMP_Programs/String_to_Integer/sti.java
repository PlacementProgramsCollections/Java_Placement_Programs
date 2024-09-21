package Java_IMP_Programs.String_to_Integer;


/*
Java Program to Convert String To Integer
 */

public class sti {
    public static void main(String[] args) {
        
        /* 1st way to Convert String to Integer */
        String str = "123";
        int num=Integer.parseInt(str);
        System.out.println(num);

        /* 2nd Way */
        String str1 = "456";
        int num1 = Integer.valueOf(str1);
        System.out.println(num1);  // Output: 456

        /* 3rd Way */
        String str2 = "789";
        int num2 = Integer.decode(str2);
        System.out.println(num2);  // Output: 789


    }
}
