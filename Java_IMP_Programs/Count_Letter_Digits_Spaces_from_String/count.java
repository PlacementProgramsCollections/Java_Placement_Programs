package Java_IMP_Programs.Count_Letter_Digits_Spaces_from_String;

import java.util.Scanner;

/* 
Java program to print number of letters, digits, 
spaces and other things in the inputted statement
 */

public class count {
    public static void WithOutUSingInbuilt() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any English statement:");
        String str = sc.nextLine();

        int countletter=0;
        int countdigit=0;
        int countspace=0;
        int countother=0;

        
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' '){
                countspace++;
            }else if(c>='0' && c<='9'){
                countdigit++;
            }else if((c>='a' && c<='z') || (c>='A' && c<='Z')){
                countletter++;
            }else{
                countother++;
            }
        }

        System.out.println("Letters : "+countletter);
        System.out.println("Digits : "+countdigit);
        System.out.println("Spaces : "+countspace);
        System.out.println("Others : "+countother);

        sc.close();
    }

    public static void USingInbuilt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any English statement:");
        String str = sc.nextLine();

        int countletter=0;
        int countdigit=0;
        int countspace=0;
        int countother=0;

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isSpaceChar(c)){
                countspace++;
            }else if(Character.isDigit(c)){
                countdigit++;
            }else if(Character.isLetter(c)){
                countletter++;
            }else{
                countother++;
            }
        }

        System.out.println("Letters : "+countletter);
        System.out.println("Digits : "+countdigit);
        System.out.println("Spaces : "+countspace);
        System.out.println("Others : "+countother);

        sc.close();
    }
    
    public static void main(String[] args) {
        WithOutUSingInbuilt();
        USingInbuilt();
    }
}
