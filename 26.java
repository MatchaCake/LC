class Solution {
    public int removeDuplicates(int[] nums) {
        int length = 1;
        if (nums == null) return 0;
        if (nums.length <= 1) return nums.length;
        for (int i = 0, j = 1; i < nums.length; i++) {
           if (nums[i] > nums[j - 1]) {
               nums[j++] = nums[i];
               length++;
           }
        }
        return length;
    }
}