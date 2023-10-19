public class MergeString {
    
    public static String solution(String s1, String s2) {


        return "null";
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "pq";

        int length = s1.length()+s2.length();
        char result[] = new char[length];

        int i = 0, j = 0;
        int count = 0;
        while(i < s1.length() && j < s2.length()) {
            if(count%2 == 0) {
                result[count] = s1.charAt(i);
                i++;
            }
            else {
                result[count] = s2.charAt(j);
                j++;
            }
            count++;
        }

        // if any elements are remaining:
        while(i < s1.length()) {
            result[count] = s1.charAt(i);
            count++;
            i++;
        }

        while(j < s2.length()) {
            result[count] = s2.charAt(j);
            count++;
            j++;
        }


        for(char c:result)
            System.out.print(c+" ");

        String finalString = result.toString();
        System.out.println(finalString.toString());

    }

}
