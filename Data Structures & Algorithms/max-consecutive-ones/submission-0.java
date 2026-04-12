class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a = 0;
        int[] t = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) t[i] = ++a;
            else a = 0;
        }
        return Arrays.stream(t).max().getAsInt();
    }
}