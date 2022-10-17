package Amazon;

import java.util.HashMap;

/**
 * Given a string, find non-repeating character in it and return it's index. if it doesn't exist, return -1.
 * 
 * Ex:
 * Input: "leetcode"
 * Output: 0
 * 
 * Input: "loveleetcode"
 * Output: 2
 */

public class FirstUniqueCharacter {
    
    public static int firstUniqueCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!map.containsKey(current)) {
                map.put(current, i);
            } else {
                map.put(current, -1);
            }
        }

        int min = Integer.MAX_VALUE;
        for (char c : map.keySet()) {
            if (map.get(c) > -1 && map.get(c) < min) {
                min = map.get(c);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueCharacter("HOLOHOLA"));
    }
}
