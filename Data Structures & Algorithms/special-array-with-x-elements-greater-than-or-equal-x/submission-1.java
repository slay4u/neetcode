class Solution {
    public int specialArray(int[] nums) {
        for (int i = 1; i < nums.length + 1; i++) {
            int count = 0;
            for (int j : nums) 
                if (j >= i) count++;
            if (i == count) return i;
        }
        return -1;
    }
}