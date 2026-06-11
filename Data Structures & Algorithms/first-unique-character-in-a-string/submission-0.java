class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int index = s.length();
        for (int i = 0; i < s.length(); i++) 
            if (map.containsKey(s.charAt(i))) map.put(s.charAt(i), -1);
            else map.put(s.charAt(i), i);
        for (int i : map.values()) 
            if (i >= 0) index = Math.min(index, i);
        return index == s.length() ? -1 : index;
    }
}