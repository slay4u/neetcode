class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> ans1 = new HashSet<>();
        Set<Integer> ans2 = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) if (!map.containsKey(i)) map.put(i, 1);
        for (int i : nums2) if (map.containsKey(i)) map.put(i, 2); else ans2.add(i);
        for (var e : map.entrySet()) if (e.getValue() == 1) ans1.add(e.getKey());
        res.add(new ArrayList(ans1));
        res.add(new ArrayList(ans2));
        return res;
    }
}