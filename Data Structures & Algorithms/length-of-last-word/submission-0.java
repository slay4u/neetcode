class Solution {
    public int lengthOfLastWord(String s) {
        char[] t = s.trim().toCharArray();
        int j = 0;
        for (int i = t.length-1; i >= 0; i--) {
            j++;
            if (t[i] == ' ') return j-1;
        }
        return j;
    }
}