class Solution {
    public int maxSubArray(int[] nums) {
        int MaxEndsHere = nums[0];
        int MaxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            MaxEndsHere = Math.max(MaxEndsHere + nums[i], nums[i]);
            MaxSoFar = Math.max(MaxSoFar, MaxEndsHere);
        }
        return MaxSoFar;
    }
}