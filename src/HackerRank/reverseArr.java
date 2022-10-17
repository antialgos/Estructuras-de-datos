package HackerRank;

public class reverseArr {

    public static int[] rev(int[] nums) {
        int min = nums.length-1, temp = 0;
        for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    temp = nums[min];
                    nums[min] = nums[j];
                    nums[j] = temp;
                    min--;
                }
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(rev(new int[]{-4,-1,0,3,10}).toString());
    }
}
