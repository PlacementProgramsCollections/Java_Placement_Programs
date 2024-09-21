package Java_IMP_Programs.String_Palindrome;

/*
 * Java program to check whether the given String text is a Palindrome
 */

public class stringpalindrome {
    public static void firstway(){
        String str="Radar";
        str=str.toLowerCase();

        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        
        if(str.equals(rev)){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("It is not a Palindrome");            
        }
    }

    public static void secondway(){
        String str="Radadfgr";
        str=str.toLowerCase();

        char[] c=str.toCharArray();

        int j=c.length-1;
        boolean isTrue=true;
        for(int i=0;i<c.length;i++){
            if(i==j || i>j){
                break;
            }
            if(c[i]!=c[j]){
                isTrue=false;
                break;
            }
            j--;
        }

        if(isTrue){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
    
    public static void main(String[] args) {
        firstway();

        //Efficient way
        secondway();
    }
}
