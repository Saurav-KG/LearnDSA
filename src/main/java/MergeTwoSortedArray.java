//Merge Sorted Array
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
// and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

public class MergeTwoSortedArray {

        public static void main(String[] args) {
            int[] nums1 = {2,0};
            int[] nums2 = {1};
            int m =1;
            int n= 1;
            int p1 = m-1; //p1=0
            int p2 = n-1; //p2 = 0
            int resIndex = m+n-1; //1
            if(m == 0){
                for(Integer val : nums2){
                    System.out.print(val + " ");
                }
                System.exit(0);
            }
            else if(n == 0){
                for(Integer val : nums1){
                    System.out.print(val + " ");

                }
                System.exit(0);
            }
            while(p1 >= 0 && p2 >= 0){
                if(nums1[p1] >= nums2[p2]){
                    nums1[resIndex] = nums1[p1];
                    resIndex--;
                    p1--;
                }
                else{
                    nums1[resIndex] = nums2[p2];
                    resIndex--;
                    p2--;
                }
            }
            if(p1>=0){
                while(p1>=0){
                    nums1[resIndex] = nums1[p1];
                    resIndex--;
                    p1--;
                }
            }
            else if(p2>=0){
                while(p2 >=0){
                    nums1[resIndex] = nums2[p2];
                    resIndex--;
                    p2--;
                }
            }
            for(Integer val : nums1){
                System.out.print(val + " ");
            }

        }

    }
