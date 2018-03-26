class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        int j = nums.length - 1;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            } 
            swap(i, j, nums);
        }
        reverse(i + 1, nums);
    }       
    
    public void reverse(int i, int[] nums) {
        int j = nums.length - 1;
        while (i < j) {
            swap(i++, j--, nums);
        }
    }
    
    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}