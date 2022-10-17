package HackerRank;

import java.util.Arrays;

public class heightChecker {

    public static int heightChecke(int[] heights) {
        int count = 0;
        int[] sortedClone = heights.clone();
        Arrays.sort(sortedClone);

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedClone[i]) {
                count++;
            }
        }

        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(sortedClone));

        return count;
    }

    public static void main(String[] args) {
        System.out.println(heightChecke(new int[] {1,1,4,2,1,3}));
    }
}
