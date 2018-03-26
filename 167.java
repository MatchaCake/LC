class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length < 2) return null;
        int[] results = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (numbers[i] + numbers[j] != target) {
            if (numbers[i] + numbers[j] > target) j--;
            else i++;
        }
        results[0] = i + 1;
        results[1] = j + 1;
        return results;
    }
}