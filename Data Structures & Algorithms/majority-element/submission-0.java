class Solution {
    public int majorityElement(int[] nums) {
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) a++;
            }
            if (a >= nums.length / 2) return nums[i];
        }
        return a;
    }
}