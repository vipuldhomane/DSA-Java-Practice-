package LeetCode;

import java.util.Scanner;

public class LT151_RevStringWord {
    public static String reverseWords(String s) {
        int n = s.length();
String revString = "";
String word ="";
for (int i = 0; i<n;i++){
    char c = s.charAt(i);

    if (c == ' ' || i == n - 1) {
    if (i == n - 1 && c != ' ') {
        word += c;
    }
    if (!word.isEmpty()) {
        revString = word + (revString.isEmpty() ? "" : " ") + revString;
        word = "";
    }
} else {
    word += c;
}

}
return revString;
}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseWords(input);
        System.out.println(ans);
    }
}
