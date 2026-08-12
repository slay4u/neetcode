class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                i++;
                count++;
            }
            for (int j = 0; j < Math.min(count, 2); j++, k++) 
                nums[k] = nums[i];
        }
        return k;
    }
}