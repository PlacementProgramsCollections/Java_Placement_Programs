package Java_IMP_Programs.Capitalize_first_letter_of_each_word;

/*
 * Java program to capitalize the first letter of each word in the given statement
 */

public class capitalize {
    public static void main(String[] args) {
        String str = "this is sample statement";

        String[] s=str.split(" ");

        for(int i=0;i<s.length;i++){
            s[i]=s[i].substring(0,1).toUpperCase() + s[i].substring(1);
            // s[i]=Character.toUpperCase(s[i].charAt(0))+s[i].substring(1);
            // s[i]=(char)(s[i].charAt(0)-32)+s[i].substring(1);
        }

        //In above forloop i have give multiple solution to convert first letter to uppercase
        //you can make use of any one which ever you feel easy

        String result=String.join(" ",s);
        System.out.println(result);
    }
}
