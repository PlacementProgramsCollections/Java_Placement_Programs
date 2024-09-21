package Java_IMP_Programs.Reverse_Number;

/*
 * Java program to reverse the given number
 */

public class reverse {
    public static void main(String[] args) {
        int n=123456;

        String str=n+""; //Converted to String

        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        n=Integer.parseInt(rev);

        System.out.println("Reversed a Number : "+n);

    }
}
