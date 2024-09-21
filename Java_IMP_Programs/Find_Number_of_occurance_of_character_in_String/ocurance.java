package Java_IMP_Programs.Find_Number_of_occurance_of_character_in_String;

/*
 * Java program to find the number of occurances of a character in the given String text
 */

public class ocurance {
    public static void main(String[] args) {
        String str = "Hello World";

        char findchar='e';
        int count=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==findchar){
                count++;
            }
        }

        System.out.println(findchar+" is found "+count+" times");
    }
}
