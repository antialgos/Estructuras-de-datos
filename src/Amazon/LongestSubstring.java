package Amazon;

import java.util.HashMap;

public class LongestSubstring {
    
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('#',0);
        
        if (s.length() == 1) return 1;
        
        for (char c: s.toCharArray()) {
            if(!map.containsKey(c)) {
                map.put(c,1);
                count++;
            } else {
                map.put(c,-1);               
                count = 1;
                }
            if (map.get('#') <= count) {
                map.put('#',count);
            }
            }
        return map.get('#');      
        }

        public static void main(String[] args) {
            LongestSubstring ls = new LongestSubstring();

            ls.lengthOfLongestSubstring("au");
        }
}
