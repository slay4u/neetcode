class Solution {
    public int majorityElement(int[] nums) {
        int a = 0, b = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (a == 0 && b != nums[i]) b = nums[i];
            else if (b != nums[i]) a--;
            else a++;
        }
        return b;
    }
}