import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,1,1,1,1,2,2}; //
    /*
        HashMap<Integer,Integer> majorityFreq =  new HashMap<>();
        for (int j : arr) {
            if (majorityFreq.containsKey(j)) {
                majorityFreq.put(j, (majorityFreq.get(j) + 1));
            } else {
                majorityFreq.put(j, 1);
            }
        }
        int valToCheck = (arr.length)/2;
        System.out.println(valToCheck);
        for(Integer k : majorityFreq.keySet()){
            if(majorityFreq.get(k) > valToCheck) {
                System.out.println(k + " " + majorityFreq.get(k));
            }
        }

        System.out.println("Saurav");

     */
       //Other Approach would be  sort the array and then pick the number in middle
        Arrays.sort(arr);
        int index = arr.length/2;
        System.out.println(arr[index]);
    }
}
