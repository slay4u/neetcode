class Solution {
    public int maxProfit(int[] prices) {
        int b = prices[0], p = 0;
        for (int s : prices) {
            if (b > s) b = s;
            p = Math.max(p, s - b);
        }
        return p;
    }
}