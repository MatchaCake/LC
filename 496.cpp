class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& findNums, vector<int>& nums) {
        int i = 0;
        int j = 0;
        int find = 0;
        int same = 0;
        int size = findNums.size();
        std::vector<int> list = findNums;
     
        for (j; j<size; j++) {
             list[j] = -1;
        }
        j = 0;
        for (i; i < size; i++) {
            while (find == 0 && j < nums.size()) {
                if (findNums[i] == nums[j]) {
                    same = 1;
                }
                else if (same == 1 && findNums[i] < nums[j]) {
                        find = 1;
                        list[i] = nums[j];
                }
                j++;
            }
            j = 0;
            find = 0;
            same = 0;
        }
       
        return list; 
    }
};