//Given N array elements count no of elements having atleast I element greater than itself
//logic : Get tot no of elements in array - substarct the number of max element
//Difficulty Level: Easy
public class IntermediateDSA {

    public static void main(String[] args) {
        int[] arr = {2,10,10,7,3,2,10,8};
        int max_value = Integer.MIN_VALUE;
        int max_count = 0;

        for(int i=0;i<arr.length;i++){

            if(arr[i] > max_value ){
                max_value = arr[i];
                max_count = 1;
            }
            else if(arr[i] == max_value){
                max_count++;
            }
        }
        System.out.println("The no of elements which have atleast one element greater is " + (arr.length - max_count));
    }
}
