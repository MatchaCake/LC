class Solution {
    public boolean isValid(String s) {
        Stack<Character> p = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') p.push(')');
            else if (c == '[') p.push(']');
            else if (c == '{') p.push('}');
            else if (p.isEmpty() || c != p.pop()) return false;
        }
        return p.isEmpty();
    }
}