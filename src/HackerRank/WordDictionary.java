package HackerRank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordDictionary {
    Map<Integer, Set<String>> d;
    
    public WordDictionary() {
        d = new HashMap();    
    }
    
    public void addWord(String word) {
        int key = word.length();
        d.putIfAbsent(key, new HashSet());
        d.get(key).add(word);
    }
    
    public boolean search(String word) {
        int key = word.length();
        if (d.containsKey(key)) {
            for (String wd : d.get(key)) {
                int i = 0;
                while ((i < key) && (wd.charAt(i) == word.charAt(i) || word.charAt(i) == '.')) {
                    i++;
                }
                if (i == key) return true;
            }
        }
        return false;
                
    }
}
