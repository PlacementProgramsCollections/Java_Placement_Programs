package Java_Array_Imp_Problems.Print_All_NonRepeated_elements_in_array;

/*
 * JAva Program to print non repeated elements in an array
 */

public class printnonduplicate {
    public static void main(String[] args) {
        int[] a={1, 1, 1, 2, 3, 4, 2, 5, 5, 5};

        for(int i=0;i<a.length;i++){
            if(a[i]==-1){
                continue;
            }
            boolean isTrue=false;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[j]=-1;
                    isTrue=true;
                }
            }
            if(!isTrue){
                System.out.println(a[i]);
            }
        }
    }
}
