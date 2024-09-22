package Java_IMP_Programs.Count_Number_of_Words_in_String;
/*
 * Java program to count number of words in a String
 */
public class countwords {
    public static void main(String[] args) {
        String str="Hello im the best coder";

        String[] c=str.split(" ");

        System.out.println("Number of words : "+c.length);
    }
}
