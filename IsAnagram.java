import java.util.HashMap;

public class IsAnagram {
     public static boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch)+1);
            } 
            else {
                map1.put(ch,1);
            }        
        }

        System.out.println(map1);
        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            
            if(map2.containsKey(ch)) {
                map2.put(ch, map2.get(ch)+1);
            } 
            else {
                map2.put(ch,1);
            }
            
        }
        
        System.out.println(map2);
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if((map2.containsKey(ch) && map2.get(ch) == map1.get(ch)))
                continue;
            else
                return false;
        }
        
        
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "naagram"));
    }
}
