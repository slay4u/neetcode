class Solution {
    public void sortColors(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    void merge(int[] arr, int l, int m, int r) {
        int s1 = m - l + 1, s2 = r - m;
        int[] L = new int[s1];
        int[] R = new int[s2];
        for (int i = 0; i < s1; i++)
            L[i] = arr[l + i];
        for (int i = 0; i < s2; i++)
            R[i] = arr[m + 1 + i];
        int i = 0, j = 0, k = l;
        while (i < s1 && j < s2) 
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        while (i < s1) arr[k++] = L[i++];
        while (j < s2) arr[k++] = R[j++];
    }
}