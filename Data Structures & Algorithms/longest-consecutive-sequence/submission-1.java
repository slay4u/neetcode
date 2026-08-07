class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int seq = 1, curr = 1;
        for (int i = 0; i < nums.length - 1; i++) 
            if (nums[i + 1] == nums[i] + 1) curr++;
            else if (nums[i] == nums[i + 1]) continue;
            else {
                seq = Math.max(seq, curr);
                curr = 1;
            }
        return Math.max(seq, curr);
    }
}
