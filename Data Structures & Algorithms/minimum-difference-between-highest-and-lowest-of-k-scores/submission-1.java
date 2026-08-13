class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = 10000;
        for (int l = 0, r = k - 1; r < nums.length; l++, r++) 
            min = Math.min(min, nums[r] - nums[l]);
        return min;
    }
}