class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 2) return strs[0];
        Arrays.sort(strs);
        if (strs[0].isBlank() || strs[0].charAt(0) != strs[1].charAt(0)) return "";
        StringBuilder s = new StringBuilder();
        int size = Math.min(strs[0].length(), strs[strs.length-1].length());
        for (int i = 0; i < size; i++) {
            if (strs[0].charAt(i) != strs[strs.length-1].charAt(i)) break;
            s.append(strs[0].charAt(i));
        }
        return s.toString();
    }
}