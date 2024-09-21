package Java_IMP_Programs.Convert_String_toLowerCase;

/*
 * Java program to convert the given String text to lower case
 */
public class stringtolower {
    public static void UsingInBuiltMethod(){
        String str="HELLOWORld";

        System.out.println(str.toLowerCase());
    }
    public static void WithoutUsingInBuiltMethod(){
        String str="HELLOWORld";

        String str1="";

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>='A' && c<='Z'){
                str1+=(char)(c+32); 
                //Adding 32 to Ascii value of character converting it back to character
            }else{
                str1+=c;
            }
        }
        System.out.println(str1);
    }
    public static void main(String[] args) {
        UsingInBuiltMethod();
        WithoutUsingInBuiltMethod();
    }
}
