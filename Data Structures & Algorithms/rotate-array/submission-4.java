class Solution {
    public void rotate(int[] nums, int k) {
        rev(nums, 0, nums.length-1);
        rev(nums, 0, k%nums.length-1);
        rev(nums, k%nums.length, nums.length-1);
    }

    void rev(int[] arr, int l, int r) {
            while (l < r) {
                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
                l++;
                r--;
            }
        }
}