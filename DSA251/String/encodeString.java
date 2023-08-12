package String;
import java.util.*;
/*
Approach
use two pointer Approach
** initialize the str, counter
** append the first char to the str
** then start form 1st index to length of string
** 	if i == i-1 then increment the counter
**	if not then 
		*append the previous counter to str
		*reset the counter to 1
		*append the current char to the string 

** edge case
	$$ for the last index counter wont get appended to the str
		** Handle this case separately 
		** append the counter to the string 

	#### In the end we will have the encoded String ####
 */
public class encodeString {
    
    
	public static String encode(String message) {
	
		int n = message.length();
		int counter = 1;
		if (n==0){
			return "";
		}
	    StringBuilder str = new StringBuilder("");
        str.append(message.charAt(0));
		for(int i = 1; i<n; i++){
            char c  = message.charAt(i);
			if (message.charAt(i) == message.charAt(i-1)){
				counter++;
			}else{
                str.append(counter);
                counter = 1;
                str.append(c);
			}
		}
		str.append(counter);
        return str.toString();
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(encode(str));
    }
}
