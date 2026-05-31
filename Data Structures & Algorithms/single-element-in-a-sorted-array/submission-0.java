class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if ((m == 0 || nums[m] != nums[m-1]) && (m == nums.length - 1 || nums[m] != nums[m+1])) return nums[m];
            int lSize = (nums[m] == nums[m-1]) ? m - 1 : m;
            if (lSize % 2 == 0) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
}