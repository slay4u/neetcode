class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] num = new int[nums.length];
        int l = 0, r = nums.length - 1, index = r;
        while (l <= r) {
            if (Math.abs(nums[r]) >= Math.abs(nums[l])) {
                num[index] = (int) Math.pow(nums[r], 2);
                r--;
            } else {
                num[index] = (int) Math.pow(nums[l], 2);
                l++;
            }
            index--;
        }
        return num;
    }
}