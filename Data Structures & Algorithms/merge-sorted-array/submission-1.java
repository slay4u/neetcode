class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[nums1.length-1-i] = nums2[n-1-i];
        }
        Arrays.sort(nums1);
    }
}