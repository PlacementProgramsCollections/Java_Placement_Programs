package Java_IMP_Programs.Length_of_String_without_using_inbuiltmethod;

/*
 *  Java program to find the size or length of the given String
 */

public class stringlength {
    public static void main(String[] args) {
        String str="Nikhil";

        System.out.println(str.length());

        //Without using inbuilt method
        char[] c=str.toCharArray();
        int i=0;
        for(char j:c){
            i++;
        }
        System.out.println("Length : "+i);
    }
}
