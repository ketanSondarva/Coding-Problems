public class lengthOfLastWord {
    public int solution(String s) {

        System.out.println(s.length());

        System.out.println(s.charAt(s.length()-1));

        int count = 0;
        int spaceCount = 0;

        for(int i=(s.length()-1); i>0; i--) {
            char c = s.charAt(i);

            if(c != ' ' && s.charAt(i-1) == ' ')
                break;

            if(c == ' ')
                spaceCount++;

            count++;
        }

        count-=spaceCount;
        return count+1;
    }

    public static void main(String[] args) {
        
        lengthOfLastWord l = new lengthOfLastWord();

        int result = l.solution("      ");
        System.out.println(result);
    }
}
