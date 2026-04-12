class Solution {
    public boolean isPalindrome(String s) {
        char[] t = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
        for (int i = 0; i < t.length / 2; i++) {
            int j = t.length - 1 - i;
            if (t[i] != t[j]) 
                return false;
        }
        return true;
    }
}