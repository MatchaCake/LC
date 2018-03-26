class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        List<Integer> l = new ArrayList<Integer>();
        int index = 0;
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                Integer pos = map.get(c);
                l.remove(pos);
            }
            else {
                l.add(i);
                map.put(c, i);
            }
           
        }
        return (l.isEmpty())? -1 : l.get(0);
    }
}