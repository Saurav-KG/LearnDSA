import java.util.HashMap;

//Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
// Check if any good pair exist or not.
public class GoodPairArrayIntermediate {
    public static void main(String[] args) {
        int[] A = {1, 2, 3,8 , 3};
        int B = 6;
        boolean res = GoodPair(A,B);
        System.out.print(res);
    }
    public static boolean GoodPair(int[] A, int B){
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(freqMap.containsKey(A[i])){
                freqMap.put(A[i],(freqMap.get(A[i]) + 1));
            }
            else{
                freqMap.put(A[i],1);
            }
        }
        for(int i=0;i<A.length;i++){
            int valToFind = B-A[i];
            if(valToFind == A[i] && freqMap.containsKey(valToFind) && (freqMap.get(valToFind) > 1)){
                return true;
            }
            else{
                if(freqMap.containsKey(valToFind)){
                    return true;
                }
            }
        }
        return false;
    }
}
