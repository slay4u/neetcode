class Solution {
    public boolean check(int[] nums) {
        int i = 0, j = 0;
        while (i < (nums.length*2)-1 && j < nums.length) {
            if (nums[i % nums.length] <= nums[(i+1) % nums.length]) j++;
            else j = 1;
            i++;
        }
        return j == nums.length;
    }
}