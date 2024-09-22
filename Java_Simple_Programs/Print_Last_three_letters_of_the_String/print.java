package Print_Last_three_letters_of_the_String;

/*
 * Java program to print the last three letters of the given text
 */

public class print {
    public static void main(String[] args) {
        String str="Nikhil";

        //Using substring
        System.out.println(str.substring(str.length()-3));


        //without using substring
        String result="";
        for(int i=str.length()-3;i<str.length();i++){
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
}
