class Solution {
    public int minimumRecolors(String blocks, int k) {
        int j = 0, count = 0, min = k + 1;
        for (int i = 0; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W') count++;
            if (i - j + 1 >= k) {
                min = Math.min(min, count);
                if (blocks.charAt(j++) == 'W') count--;
            }
        }
        return min;
    }
}