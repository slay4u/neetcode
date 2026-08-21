class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z0-9]","");
        for (int l = 0, r = str.length() - 1; l < r; l++, r--) 
            if (str.charAt(l) != str.charAt(r)) return false;
        return true;
    }
}
