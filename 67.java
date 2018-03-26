class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        if (a.length() == 0) return b;
        if (b.length() == 0) return a;
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += (a.charAt(i--) - '0');
            }
            if (j >= 0) {
                sum += (b.charAt(j--) - '0');
            }
            carry = sum / 2;
            sum = sum % 2;
            result = sum + result;
            
        }
        if (carry != 0) result = carry + result;
        return result;
    }
}