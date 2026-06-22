class Solution {
    public double averageWaitingTime(int[][] customers) {
        double time = 0, curr = 0;
        for (int i = 0; i < customers.length; i++) {
            curr = Math.max(curr, customers[i][0]) + customers[i][1];
            time += curr - customers[i][0];
        }
        return time / customers.length;
    }
}