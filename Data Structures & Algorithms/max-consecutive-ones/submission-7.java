class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a = 0, b = 0;
        for (int i : nums) {
            if (i == 1) ++a;
            else if (b > a) a=0;
            else {
                b=a;a=0;
            }
        }
        return Math.max(a,b);
    }
}