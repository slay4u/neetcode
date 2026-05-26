class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1, r = 46340;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (num == m * m) return true;
            else if (num > m * m) l = m + 1;
            else r = m - 1;
        }
        return false;
    }
}