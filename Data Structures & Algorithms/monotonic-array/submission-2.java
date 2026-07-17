class Solution {
    public boolean isMonotonic(int[] nums) {
        int asc = 0, desc = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) desc++;
            if (nums[i] <= nums[i + 1]) asc++;
        }
        return asc == nums.length - 1 || desc == nums.length - 1;
    }
}