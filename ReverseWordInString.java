import java.util.Arrays;
import java.util.Stack;

public class ReverseWordInString {
    public static String reverseWords(String s) {
        
        // Solution 1:

        // StringBuffer sb = new StringBuffer(s.trim());
        // System.out.println(sb);
        // sb.append(" ");

        // Stack<String> stk = new Stack<String>();

        // StringBuffer sb2 = new StringBuffer();
        // for(int i = 0; i < sb.length()-1; i++) {
        //     if(sb.charAt(i) != ' ' && sb.charAt(i+1) == ' ') {
        //         sb2.append(sb.charAt(i));
        //         stk.push(sb2.toString());
        //         sb2 = new StringBuffer();
        //     }
        //     else if(sb.charAt(i) != ' ')
        //         sb2.append(sb.charAt(i));
        // }

        // System.out.println("top = "+stk.peek());
        
        // while(!(stk.isEmpty())) {
        //     sb2.append(stk.pop()+" ");
        // }

        // System.out.println(stk);
        // return new String(sb2).trim();



        // Solution 2:

        // Trim the input string to remove leading and trailing spaces
        String[] str = s.trim().split("\\s+");

        System.out.println(Arrays.toString(str));

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i > 0; i--) {
            // Append the current word and a space to the output
            out += str[i] + " ";
        }

        // Append the first word to the output (without trailing space)
        return out + str[0];
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("             Hello     world of the java  "));
    }
}
