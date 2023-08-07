package LeetCode;
/*
Algorithm 
keep two variable one will keep the total score and one will keep the sum  of all the previous elements 
[1   7   3   6   3   6]
      lsum   i    rsum
    keep decreasing i form the rsum with each iteration and 
    keep adding i-1 to lsum
    at any moment rsum == lsum return the index i.e. i
    if loop is over it means index does not exist and return            
 */

public class LT724_PivotIndex {

    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for(int elem : nums){
            totalSum += elem;
        }

        for (int i = 0; i< nums.length; i++){
            if(i !=0){
            leftSum += nums[i-1]; 
        }
            totalSum -= nums[i];
            if (totalSum == leftSum){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
    }
}
