class Solution {
public:
    vector<string> fizzBuzz(int n) {
        std::vector<string> list(n,"");
        
        for (int i = 1; i <= n; i++) {
            if (i%3 ==0&& i%5==0) {
                list[i-1] = "FizzBuzz";
            }
            else {
                if (i%3==0) {
                    list[i-1] = "Fizz";
                }
                else if (i%5==0) {
                    list[i-1] = "Buzz";
                }
                else {
                    list[i-1] = std::to_string(i);
                }
            }
        }
        return list;
    }
};