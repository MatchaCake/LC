public class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos = 0;
        for (pos = 0; pos <nums.length; pos++) {
            if (target<=nums[pos]) {
                break;
            }
        }
        return pos;
    }
}