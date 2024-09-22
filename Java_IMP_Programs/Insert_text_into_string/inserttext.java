package Java_IMP_Programs.Insert_text_into_string;

/*
 * Java Program to insert text in between String 
 */

public class inserttext {
    public static void main(String[] args) {
        String str="Hello World";

        String inserttext="Hi";

        String[] arrstring=str.split(" ");

        int lenofone=arrstring[0].length();

        String result=str.substring(0,lenofone)+" "+inserttext+" "+str.substring(lenofone+1);

        System.out.println(result);
    }
}
