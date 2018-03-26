class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] alphabet = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            alphabet[c1 - 'a'] ++;
            alphabet[c2 - 'a'] --;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) return false;
        }
        return true;
    }
}