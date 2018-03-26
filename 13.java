class Solution {
    public int romanToInt(String s) {
        if (s.length() == 0) return 0;
        char first = s.charAt(0);
        int result = 0;
        int firstResult = converter(first);
        if (s.length() >= 2) {
            char second = s.charAt(1);
            int secondResult = converter(second);
            if (secondResult > firstResult) firstResult *= -1;
            int remainResult = romanToInt(s.substring(1));
            result = result + firstResult + remainResult;
        }
        else {
            result += firstResult;
        }
        return result;
    }
    
    public int converter(char c) {
        int result = 0;
        switch (c) {
            case 'I':
                    result = 1;
                    break;
            case 'V':
                    result = 5;
                    break;
            case 'X':
                    result = 10;
                    break;
            case 'L':
                    result = 50;
                    break;
            case 'C':
                    result = 100;
                    break;
            case 'D':  
                    result = 500;
                    break;
            case 'M':
                    result = 1000;
                    break;
        }
        return result;
    }
}