package Java_IMP_Programs.remove_special_characters_spaces_and_other_junk_from_the_given_String_text;

/*
 * Java program to remove special characters, spaces and other junk from the given String text
 */

public class filterstring {
    public static void main(String[] args) {
        String str = "$131#@% $abcd123 ABCDEF()";

        String str2="";

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')){
                str2+=c;
            }
        }
        System.out.println(str2);

        //Alternate Way using regular expression
        String str3 = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str3);
    }
}
