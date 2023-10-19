public class LongestCommonPrefix {
        public static String longestCommonPrefix(String[] strs) {
            
            // ["flower","flow"]

            int count = Integer.MAX_VALUE;

            String first = strs[0];
            for(int i = 1; i < strs.length; i++) {
                int minCount = 0;
                for(int j = 0; j < strs[1].length(); j++) {
                    if(first.charAt(j) == strs[i].charAt(j)) {
                        minCount++;
                    }
                }
                if(minCount == 0) {
                    return "";
                }
                count = Math.min(count, minCount);
            }

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < count; i++) {
                sb.append(strs[0].charAt(i));
            }

            return new String(sb);

            // // finding the length of the smallets string:
            // int minLength = strs[0].length();

            // for(int i = 1; i < strs.length; i++) {
            //     if(minLength > strs[i].length())
            //         minLength = strs[i].length();
            // }

            // System.out.println(minLength);

            // StringBuilder sb = new StringBuilder();
            
            // String curr = strs[0];
            
            // for(int i = 1; i < minLength; i++) {
            //     int k = 0;
            //     if(curr.charAt(k) == strs[i].charAt(k)) {
                    
            //     }
            // }
            
            // return "hello";
        }

        public static void main(String[] args) {

            String[] lcf = {"flight","flow","flower"};

            System.out.println("hello world");
            String result = longestCommonPrefix(lcf);

            System.out.println(result);
        }
}
