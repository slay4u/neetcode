class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        if (strs[0].isBlank()) return "";
        StringBuilder s = new StringBuilder();
        int size = Math.min(strs[0].length(), strs[strs.length-1].length());
        for (int i = 0; i < size; i++) {
            if (strs[0].charAt(i) != strs[strs.length-1].charAt(i)) break;
            s.append(strs[0].charAt(i));
        }
        return s.toString();
    }
}