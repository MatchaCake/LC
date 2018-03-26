class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new LinkedList<String>();
        LinkedList<String> result = new LinkedList<String>();
        String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while (result.peek().length() == i) {
                String original = result.remove();
                for (int j = 0; j < map[index].length(); j++) {
                    String newStr = original + map[index].charAt(j);
                    result.add(newStr);
                }
            }
        }
        return result;
    }
}