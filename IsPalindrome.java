public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        
        StringBuffer sb = new StringBuffer((s.trim()));

        System.out.println(s.toLowerCase() == sb.reverse().toString().toLowerCase());

        // for(int i = 0; i < s.length(); i++) {
        //     char ch = Character.toLowerCase(s.charAt(i));
            
        //     if(Character.isLetter(ch))
        //         sb.append(ch);
        // }

        // for(int i = 0; i < sb.length(); i++) {
        //     char ch = sb.charAt(i);

        //     if(ch != sb.reverse().charAt(i))
        //         return false;
        // }

        return true;
    }

    public static void main(String[] args) {
        
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
