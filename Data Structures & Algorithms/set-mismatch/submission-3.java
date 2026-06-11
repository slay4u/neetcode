class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length];
        int num = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            arr[i] = i+1;
            if (set.contains(nums[i])) num = nums[i];
            else set.add(nums[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) return new int[] {num, arr[i]};
        }
        return null;
    }
}