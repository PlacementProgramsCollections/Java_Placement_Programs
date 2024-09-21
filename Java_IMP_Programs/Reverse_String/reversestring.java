package Java_IMP_Programs.Reverse_String;

/*
Java program to reverse a String
 */

public class reversestring {
    public static void main(String[] args) {
        String str = "Nikhil";
        String rev ="";

        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        System.out.println(rev);
    }
}
