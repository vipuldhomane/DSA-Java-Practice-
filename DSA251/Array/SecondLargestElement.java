package Array;
/*
SecondLargestElement
 */

public class SecondLargestElement {
    public static int findSecondLargest(int n, int[] arr) {
        // If Array is Empty or only one Element in array return -1
        if (n == 0 || n == 1) {
            return -1;
        }
        // set first element of array as maximum
        int max = arr[0];
        int sMax = -1;
        // traverse form the 2nd elements i.e. 1st index as 0th index is already set as
        // max
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            } else if (arr[i] != max && arr[i] > sMax) {
                // most important condition for duplicate elements
                sMax = arr[i];
            }
        }
        return sMax;
    }

    public static void main(String[] args) {
        // int arr[] = { 12, 1, 35, 10, 34, 34, 1 };
        int arr[] = { 0, 1 };
        System.out.println(findSecondLargest(arr.length, arr));
    }
}