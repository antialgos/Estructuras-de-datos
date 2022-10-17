package Amazon;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i : nums) {
            if(nums[i] != val) {
                nums[index++] = i;
            }
        }
        return index;
    }
}
