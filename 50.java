class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        double result = 0;
        double temp = myPow(x, n / 2);
        if (n % 2 == 0) {
            result = temp * temp;
        }
        else {
            if (n < 0) {
                result = temp * temp / x;
            }
            else {
                result = temp * temp * x;
            }
        }
        return result;
    }
}