package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
// Return any array that satisfies this condition.
// Example 1:
// Input: nums = [3,1,2,4]
// Output: [2,4,3,1]
// Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
// Example 2:
// Input: nums = [0]
// Output: [0]
// Constraints:
// 1 <= nums.length <= 5000
// 0 <= nums[i] <= 5000
public class sortArrayByParity {
    
    public static int[] sortArrayByParit(int[] nums) {
        int writer = 0,temp = 0;
        
        for (int reader = 0; reader < nums.length; reader++) {
            if(nums[reader]%2 == 0) {
                temp = nums[writer];
                nums[writer++] = nums[reader];
                nums[reader] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParit(new int[]{3,1,2,4})));
    }
}
