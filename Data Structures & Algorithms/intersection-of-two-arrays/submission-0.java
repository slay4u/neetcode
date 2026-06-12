class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1)
            set1.add(i);
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2)
            set2.add(i);
        if (set1.size() >= set2.size()) {
            int arrSize = 0;
            for (int i : set2) {
                if (set1.contains(i)) arrSize++; 
            }
            int[] arr = new int[arrSize];
            int j = 0;
            for (int i : set2) {
                if (set1.contains(i)) arr[j++] = i;
            }
            return arr;
        } else {
            int arrSize = 0;
            for (int i : set1) {
                if (set2.contains(i)) arrSize++; 
            }
            int[] arr = new int[arrSize];
            int j = 0;
            for (int i : set1) {
                if (set2.contains(i)) arr[j++] = i;
            }
            return arr;
        }
    }
}