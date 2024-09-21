package Java_IMP_Programs.Input_String_Print_Duplicate_Character_With_Count;

/* 
Java program which intakes String and prints the duplicate 
characters along with number of times 
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duplicate {
    public static void UsingHashMap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any English statement:");
        String str = scanner.nextLine();

        Map<Character, Integer> m = new HashMap<Character, Integer>();

        char[] ca = str.toCharArray();

        for (Character c : ca) {
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }

        for (Character c : m.keySet()) {
            if (m.get(c) > 1) {
                System.out.println("Character " + c + " is repeated: " + m.get(c) + " times");
            }
        }

        scanner.close();
    }
    
    public static void WithOut_Using_Inbuilt_Function(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any English statement:");
        String str = sc.nextLine();

        char[] c=str.toCharArray();

        int count=1;

        for(int i=0;i<str.length();i++){
            if(c[i]=='0'){
                continue;
            }
            for(int j=i+1;j<str.length();j++){
                if(c[i]==c[j]){
                    count++;
                    c[j]='0';
                }
            }
            if(count>1){
                System.out.println("Character "+c[i]+" is repeated: "+count+"times");
            }
            count=1;
        }

        sc.close();
    }
    public static void main(String[] args) {
        
        /* Efficient way */
        UsingHashMap();

        /* Non Efficient way */
        WithOut_Using_Inbuilt_Function();
    }
}
