package LeetCode;

public class LT665_NonDecreasingArray {
    public static boolean nonDecreasing(int nums[]){
        boolean changed = false;
        for (int i = 0; i< nums.length-1; i++){
            if (nums[i]<=nums[i+1]){
                continue;
            }
            if (changed) return false;

            // want to decreas the left element
            if (nums[i+1] >=nums[i-1]){
            nums[i] =nums[i+1];
                changed = true;
            }else{
            nums[i+1] =nums[i];
                changed = true;
            }
        }    
        return changed;
    }

    public static void main(String[] args) {
        int arr[]   ={3,4,2,3};
        boolean ans = nonDecreasing(arr);
        System.out.println(ans);
    }
}
/* 
 Algorithm
   i-1    i    i+1 
 [  3 ,   4 ,   2 ,  3 ]
 solve using two pointer method 
 as long as i <= i+1 skip the iteration
 if it is not changing the i to 
 */