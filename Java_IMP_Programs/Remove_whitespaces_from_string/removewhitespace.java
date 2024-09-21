package Java_IMP_Programs.Remove_whitespaces_from_string;

/*
 * Java program to remove white spaces in the given string text
 */

public class removewhitespace {
    public static void main(String[] args) {
        String str = "A   B   C    D" ;

        //Using Inbuilt Method
        String str1=str.replace(" ","");
        System.out.println(str1);

        //Without Using Inbuilt method
        String str2="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                str2+=str.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
