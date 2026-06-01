class Solution {
    public boolean check(int[] nums) {
        int[] arr = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) 
            arr[i] = arr[i + nums.length] = nums[i];
        int i = 0, j = 0;
        while (i < arr.length-1 && j < nums.length) {
            if (arr[i] <= arr[i+1]) j++;
            else j = 1;
            i++;
        }
        return j == nums.length;
    }
}