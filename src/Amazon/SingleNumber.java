package Amazon;

import java.util.HashSet;

public class SingleNumber {


    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : nums) {
            if(set.contains(i)){
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        for (Integer i : set) {
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        
    }
}
