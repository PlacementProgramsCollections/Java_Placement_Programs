package Java_Array_Imp_Problems.Convert_String_toArray_Reverse_it;

/*
 * Java program to reverse the position of words in the String
 */

public class reversestringArray {
    public static void main(String[] args) {
        String str = "Hello Im the coder";

        String[] a=str.split(" ");

        int j=a.length-1;
        for(int i=0;i<a.length;i++){
            if(i==j || i>j){
                break;
            }
            String temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;
        }

        str=String.join(" ",a);

        System.out.println(str);
    }
}
