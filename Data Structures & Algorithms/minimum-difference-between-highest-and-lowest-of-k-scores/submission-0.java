class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = 10000, l = 0, r = k - 1;
        while (r < nums.length) {
            int diff = nums[r++] - nums[l++];
            min = Math.min(min, diff);
        }
        return min;
    }
}