class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 2) return strs[0];
        Arrays.sort(strs);
        if (strs[0].isBlank() || strs[0].charAt(0) != strs[1].charAt(0)) return "";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) != strs[1].charAt(i)) break;
            s.append(strs[0].charAt(i));
        }
        for (int i = 2; i < strs.length; i++) {
            if (strs[i].contains(s.toString())) continue;
            else s.deleteCharAt(s.length()-1);
        }
        return s.toString();
    }
}