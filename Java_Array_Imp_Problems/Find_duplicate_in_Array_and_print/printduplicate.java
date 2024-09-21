package Java_Array_Imp_Problems.Find_duplicate_in_Array_and_print;

/*
 * Java program to find the duplicate elements in the array
 */

public class printduplicate {
    public static void main(String[] args) {
        int[] a = {3,3,4,4,5,5,3,6,4,5,3,3};

        for(int i=0;i<a.length;i++){
            if(a[i]==-1){
                continue;
            }
            int index=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    index++;
                    a[j]=-1;
                }
            }
            if(index>1){
                System.out.println(a[i]+" is duplicated "+index+"times");
            }
        }
    }
}
