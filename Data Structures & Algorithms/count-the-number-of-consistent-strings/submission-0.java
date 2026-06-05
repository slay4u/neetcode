class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String s : words) {
            int i = 0, j = 0;
            while (i < s.length() && j < allowed.length()) {
                if (s.charAt(i) == allowed.charAt(j)) {
                    i++;
                    j = 0;
                } else j++;
            }
            if (i == s.length()) count++;
        }
        return count;
    }
}