import java.util.Arrays;

//Given an integer array A,
// find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
public class SortingEasyIntermediate {
    public static void main(String[] args) {
        int[] A = {3, 2, 1, 3};
        Arrays.sort(A);

        for(int i=0;i<A.length;i++){
            while(i < A.length-1 && A[i] == A[i+1]){
                i++;
            }
            if(A[i] == A.length -1 -i){
                System.out.print("The Number greater than" + A[i] +"=" + (A.length -1 -i) );
                break;
            }
        }
        System.out.print("Condition failed");


    }
}
