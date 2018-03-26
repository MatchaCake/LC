class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null) return null;
        int[] result = new int[nums.length];
        /* left */
        int left = 1;
        result[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = left;
            left *= nums[i];
        }
        /* right */
        int right = 1;
        for (int i = nums.length - 1; i > -1; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }
} 