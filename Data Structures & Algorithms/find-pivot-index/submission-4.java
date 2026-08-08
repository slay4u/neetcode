class Solution {
    public int pivotIndex(int[] nums) {
        int ls = 0, rs = 0;
        for (int i = 1; i < nums.length; i++) 
            rs += nums[i];
        for (int i = 0; i < nums.length; i++) 
            if (ls == rs) return i;
            else if (i != nums.length - 1) {
                ls += nums[i];
                rs -= nums[i + 1];
            }
        return -1;
    }
}