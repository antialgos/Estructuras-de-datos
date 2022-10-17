package HackerRank;
// Given a binary array nums, return the maximum number of consecutive 1's in the array.
// Example 1:
// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
// Example 2:
// Input: nums = [1,0,1,1,0,1]
// Output: 2
// Constraints:
// 1 <= nums.length <= 105
// nums[i] is either 0 or 1.
public class findMaxConsecutiveOnes {

    public static int findMax(int[] nums) {
        int count = 0,max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        
        System.out.println(findMax(new int[]{1,1,0,1,1,1}));
    }
}
