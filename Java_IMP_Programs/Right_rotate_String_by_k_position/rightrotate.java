package Java_IMP_Programs.Right_rotate_String_by_k_position;

/*
Write a program to right rotate a given string str by k positions and 
return the resulting string.
*/

public class rightrotate {
    public static void main(String[] args) {
        String str="HelloWorld";
        //ldHelloWor

        int k=3;

        if(k>str.length()){
            System.exit(0);
        }

        StringBuilder builder=new StringBuilder();

        for(int i=str.length()-k;i<str.length();i++){
            builder.append(str.charAt(i));
        }

        for(int i=0;i<str.length()-k;i++){
            builder.append(str.charAt(i));
        }

        System.out.println(builder);
    }
}
