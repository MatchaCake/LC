class Solution {
    public int findKthLargest(int[] nums, int k) {
        int result = 0;
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(nums.length, new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i > j) {return -1;}
                else if (i == j) {return 0;}
                else {return 1;}
            }  
        });
        for (int i = 0; i < nums.length; i++) {
            q.add(nums[i]);
        }
        for (int i = 0; i < k; i++) {
            result = q.poll();
        }
        return result;
    }
}