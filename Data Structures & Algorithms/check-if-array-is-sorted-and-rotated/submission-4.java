class Solution {
    public boolean check(int[] nums) {
        int j = 0;
        for (int i = 0; i < (nums.length * 2) - 1; i++) {
            if (nums[i % nums.length] <= nums[(i + 1) % nums.length]) j++;
            else j = 1;
            if (j == nums.length) return true;
        }
        return false;
    }
}