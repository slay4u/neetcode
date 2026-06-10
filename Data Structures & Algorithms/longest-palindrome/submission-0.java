class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            if (map.get(s.charAt(i)) % 2 == 0) res += 2;
        }
        for (int i : map.values())
            if (i % 2 == 1) {
                res++;
                break;
            }
        return res;
    }
}