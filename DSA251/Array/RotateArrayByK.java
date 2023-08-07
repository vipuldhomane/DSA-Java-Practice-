package Array;

import java.util.Scanner;

public class RotateArrayByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Size of array");
        // int n = sc.nextInt();

        // int arr[] = new int[n];
        int arr[] = {1,2,3,4,5,6};
        int k = 2;
        int n = arr.length;
        // System.out.println("Enter the value of k");
        // int k = sc.nextInt();
        
        // for(int i = 0; i< n; i++){
        //     arr[i] = sc.nextInt();
        // }
        rotateByK(arr, k, n);

        for (int elem : arr){
            System.out.print(elem+" ");
        }
        
    }

    private static void rotateByK(int[] arr, int k, int n) {
        int temp[] = new int[k];

        // add the first k elem into temp
        for (int i =0; i<k; i++){
            temp[i] = arr[i];
        }
        //now shift the elements by k 
        for (int i = 0; i<n-k; i++){
            arr[i]= arr[i+k];
        }
        // now add the temp to the original arr
        int i = n-k;
        int j = 0;
        while (i<n){
            arr[i]= temp[j];
            i++;
            j++;
        }
    }
}
