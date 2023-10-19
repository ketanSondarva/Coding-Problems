
// top interview question easy collection:

public class StringToInteger {
    public static int myAtoi(String s) {

        StringBuffer sb = new StringBuffer();
        int pos = 0;

       // getting the index where first digit is found:
       for(pos = 0; pos < s.length(); pos++) {
            char ch = s.charAt(pos);
            if(Character.isDigit(ch))
                break;
       }

       // checking for previous charracter is sign:
       if(pos > 0 && (s.charAt(pos-1) == '+' || s.charAt(pos-1) == '-')) {
            sb.append(s.charAt(pos-1));
       }

       System.out.println(sb);

        // take until its a continous number:
        for(int i = pos; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) 
                sb.append(ch);
            else
                break;
        }

        System.out.println(sb);

        if(sb.length() == 0)
            return 0;

        

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        
        System.out.println(myAtoi("__foaviadviugisdg"));
    }
}
