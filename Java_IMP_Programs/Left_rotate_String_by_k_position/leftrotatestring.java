package Java_IMP_Programs.Left_rotate_String_by_k_position;

/*
Write a program to left rotate a given string str by k positions and 
return the resulting string.
*/

public class leftrotatestring {
    public static void main(String[] args) {
        
        String str="HelloWorld";

        int k=5;

        StringBuilder builder=new StringBuilder();

        for(int i=k;i<str.length();i++){
            builder.append(str.charAt(i));
        }

        for(int i=0;i<k;i++){
            builder.append(str.charAt(i));
        }

        System.out.println(builder);
    }
}
