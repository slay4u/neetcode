class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            count += map.getOrDefault(i, 0);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return count;
    }
}