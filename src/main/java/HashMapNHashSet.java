//Given an array A. You have some integers given in the array B.
//For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.
//A = [1, 2, 1, 1]
//B = [1, 2]
//res = [3,1]

import java.util.HashMap;

public class HashMapNHashSet {
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 1};
        int[] B = {1, 2};

        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(freqMap.containsKey(A[i])){
                freqMap.put(A[i],(freqMap.get(A[i])+1));
            }
            else{
                freqMap.put(A[i],1);
            }
        }
        int[] res = new int[B.length];
        for(int i=0;i<B.length;i++){
            if(freqMap.containsKey(B[i])){
                res[i] = freqMap.get(B[i]);
            }
            else{
                res[i] = 0;
            }
        }
        for(Integer i : res){
            System.out.print(i + " ");
        }
    }
}
