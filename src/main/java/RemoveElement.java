//Type -Easy Question - Remove elements with val from array
//Keep all numbers at the end with val in the array

public class RemoveElement {

    public static void main(String[] args) {
        int i=0;
        int[] nums = {3,2,2,3};
        int val = 3;
        for(int j=0;j<nums.length;j++){
            if(nums[j] != val){
                swap(i,j,nums);
                i++;
            }
        }

    }


    public static void swap(int i,int j,int[] B){
        int temp = B[i];
        B[i] = B[j];
        B[j] = temp;
    }
}
