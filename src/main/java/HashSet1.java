//Number of distinct element in array INTERMEDIATE EASY QUESTION
import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        int[] A = {1,1,2,3,4};
        HashSet<Integer> freqHash = new HashSet<>();
        for(int i=0;i<A.length;i++){
            freqHash.add(A[i]);
        }
        System.out.print(freqHash.size());
    }
}
