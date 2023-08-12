package String;

import java.util.Scanner;

public class RevStringWordwise {
       
 
    public static string
    // Different approach
            // // spilt the array based on space and store it in array
            // String[] strarray= input.split(" ");
            // String rev = "";
            // // traverse the array in reverese order and append to the rev with space
            // for (int i =strarray.length-1; i>=0;i--){
            //     rev += strarray[i]+" ";
            // }
            // // now we have string in rev order
            // return rev;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
