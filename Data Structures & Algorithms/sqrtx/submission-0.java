class Solution {
    public int mySqrt(int x) {
        int l = 1, r = 46340;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (m * m == x) return m;
            else if (m * m > x) r = m - 1;
            else l = m + 1;
        }
        return l - 1;
    }
}