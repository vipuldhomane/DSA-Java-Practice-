package LeetCode;
import java.util.PriorityQueue;
/* Algorithm
    # Initialize a Priority queue {Here we need to find the max. so our element will be the 
    first element of the pq Therefore initialize a [MinPriority queue which is default]} 
    # add first k elements from the given array to the PQ 
    # Now Traverse on the remaining elements from the array and compare the element with the
    minimum element or first element of PQ. 
    # if Element > PQ first element 
    then remove the first element and add the Array Element to the PQ 
    # The pq Will reorder the elements
    # In the end the first element will the the kth largest element if there are no duplicates
    # if the duplicate values exists in the list then 
    ##check if the Array Element ***does not exits in the pq*** only then add the array element
    ## by this way only unique elements will be present in the pq and the first element will be ans

*/
public class LT215_KthLargest  {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // add firt k elements into the queue 
        for (int i = 0; i < k; i++){
            pq.add(nums[i]);
        }
        for(int i =k; i< nums.length; i++){
            if (nums[i]> pq.peek()){

                // This if condition is keeping only unique elements 
                // can be removed if there are no duplicate elements in the array
                
                if (!pq.contains(nums[i])){
                    pq.poll();
                    pq.add(nums[i]);
                }
            }
        }
        // now we have kth largest element at first position in pq
        return pq.poll();
    }  
    //Leetcode solution
    public int findKthLargestLTS(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num: nums) {
            heap.add(num);
            if (heap.size() > k) {
                heap.remove();
            }
        }
        return heap.peek();
    }
    
     public static void main(String[] args) {
        int arr[] = { 12, 34, 4, 54, 32, 21, 23, 53, 54 };
        int klargest = findKthLargest(arr, 3);
        System.out.println(klargest);
        // System.out.println(klargest.get(0));
    }
}
// Dry run
