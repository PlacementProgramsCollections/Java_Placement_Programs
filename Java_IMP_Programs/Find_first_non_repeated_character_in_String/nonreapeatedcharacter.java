package Java_IMP_Programs.Find_first_non_repeated_character_in_String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Java program to find the first non-repeated character
 * in the given string 
 * ex : "swiss" -> output : "w"
 */

public class nonreapeatedcharacter {
    static void solution1(String str){
        str=str.toLowerCase();

        for(int i=0;i<str.length();i++){
            int count=0;
            char c=str.charAt(i);
            for(int j=i+1;j<str.length();j++){
                if(c==str.charAt(j)){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("First non-repeated character is : "+c);
                break;
            }
        }
    }

    static void solution2(String str){
        str=str.toLowerCase();
        int[] freq=new int[26]; //Assuming only lowercase a-z characters    
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            freq[c-'a']++;
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(freq[c-'a']==1){
                System.out.println("First non-repeated character is : "+c);
                break;
            }
        }
    }

    static void solution3(String str) {
        str = str.toLowerCase();  // Optional: for case-insensitive check
        Map<Character, Integer> freq = new LinkedHashMap<>();

        // Step 1: Count frequency of each character
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find first non-repeated character
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character is: " + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeated character found.");
    }

     static void solution4(String str) {
        str = str.toLowerCase();
        char ch;
        boolean status = false;

        Map<Character, Integer> strmap = new HashMap<>();

        // Step 1: Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            strmap.put(ch, strmap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find the first non-repeated character
        for (int i = 0; i < str.length(); i++) {
            char d = str.charAt(i);
            if (strmap.get(d) == 1) {
                System.out.println("First non-repeated character is: " + d);
                status = true;
                break;
            }
        }

        if (!status) {
            System.out.println("There is no unique character in the given string");
        }
    }

    public static void main(String[] args) {
        String str="Amazon"; //Convert to lowercase if case insensitive
        
        // Below worst case time complexity solution O(n^2)
        solution1(str);

        // Below worst case time complexity solution O(n)
        solution2(str);

        // Below worst case time complexity solution O(n)
        // Using LinkedHashMap to maintain insertion order
        solution3(str);

        // Below worst case time complexity solution O(n)
        // Using HashMap
        solution4(str);
    }
}
