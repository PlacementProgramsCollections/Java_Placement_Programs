package Java_IMP_Programs.Reverse_each_word_in_String;

/*
 * Java program to reverse each and every word in the given String text
 */
public class reversewordstring {
    public static String reverseString(String c){
        String str="";
        for(int i=c.length()-1;i>=0;i--){
            str+=c.charAt(i);
        }
        return str;
    }
    public static void main(String[] args) {
        String str="Hello World HI Bye";

        String[] c=str.split(" ");

        for(int i=0;i<c.length;i++){
            c[i]=reverseString(c[i]);
        }

        str=String.join(" ",c);
        System.out.println(str);
    }
}
