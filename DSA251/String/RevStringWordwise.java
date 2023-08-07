package String;

import java.util.Scanner;

public class RevStringWordwise {
        static String reverseStringWordWise(String input) {
        int n = input.length();
        String revString = "";
        String word ="";
        for (int i = 0; i<n;i++){
            char c = input.charAt(i);

            if (c == ' ' || i==n-1){
                if (i == n-1){
                    word += c;
                }
                revString = word +" " + revString;
                
                word = "";
            }else{
                word += c;
            }
        }
        return revString;

    }

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
