package Java_IMP_Programs.Remove_duplicate_elements_from_the_string;
/*
 * Java program to remove the duplicate charaters in the given String
 */
import java.util.HashSet;
import java.util.Set;

public class removeduplicate {
    public static void usingHashSet(){
        String str="coconut";

        Set<Character> set = new HashSet<Character>();

        char[] c=str.toCharArray();

        for(char a: c){
            set.add(a);
        }
        // System.out.println(set);

        StringBuilder builder = new StringBuilder(); 

        for(char a:set){
            builder.append(a);
        }
        System.out.println(builder);
    }
    public static void manually(){
        String str="coconut";

        char[] c=str.toCharArray();

        String result="";

        for(int i=0;i<c.length;i++){
            if(c[i]=='0'){
                continue;
            }
            result+=c[i];
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    c[j]='0';
                }
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        usingHashSet();
        manually();
    }
}
