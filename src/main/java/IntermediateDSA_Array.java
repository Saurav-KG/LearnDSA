import java.util.*;

//Given N array elements, check if there exist a pair i,j such that ar[i] + ar[j] == k & i!=j
//This is taken from Intermediate Introduction to Array module
//Difficulty Level : easy
public class IntermediateDSA_Array {
    public static void main(String[] args) {
        int[] arr = {3, 187, 1, 4, 3, 6, 8};
        int k = 8;

        //1st Approach using normal O(N2)
      //  System.out.println(checkifexist(arr,k));

        //2nd Approach using HashSet O(N)
        System.out.println(hashsetapproach(arr,k));
    }
    //Time Complexicity O(N2)
    public static boolean checkifexist(int[] arr,int k){
        for (int i = 0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!= j && (arr[i]+arr[j] == k)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean hashsetapproach(int[] arr,int k){
        Map<Integer, Integer> newmap = new HashMap<>();

        //TC: O(N)
        for(int i=0;i<arr.length;i++){
            if(newmap.containsKey(arr[i])){
                newmap.put(arr[i],(newmap.get(arr[i])+1));
            }
            else{
                newmap.put(arr[i],1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(newmap.containsKey(k - arr[i]) && (newmap.get(k - arr[i]) >= 1)){
                if(arr[i] == (k-arr[i]) && (newmap.get(k - arr[i]) == 1) ) return false;
                else return true;
            }
        }
        return false;
    }
}
