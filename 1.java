class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
        int complement = target - numbers[i];
        if (map.containsKey(complement)) {
            result[0] = i;
            result[1] = map.get(complement);
            return result;
        }
        map.put(numbers[i], i);
    }
    return result;
    }
}