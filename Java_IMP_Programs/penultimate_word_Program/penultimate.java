package Java_IMP_Programs.penultimate_word_Program;
/*
 * Java program to find the penultimate word of a sentance
 */
public class penultimate {
    public static void main(String[] args) {
        String str = "penultimate word is the second last word in the given sentence";

        String[] str1=str.split(" ");

        if(str1.length>1){
            System.out.println(str1[str1.length-2]);
        }else{
            System.out.println("Cannot find");
        }
    }
}
