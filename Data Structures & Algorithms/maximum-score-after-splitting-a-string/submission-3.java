class Solution {
    public int maxScore(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int zeros = 0, ones = 0;
            for (int k = 0; k < i + 1; k++) 
                if (s.charAt(k) == '0') zeros++;
            for (int j = s.length() - 1; j > i; j--) 
                if (s.charAt(j) == '1') ones++;
            count = Math.max(count, zeros + ones);
        }
        return count;
    }
}