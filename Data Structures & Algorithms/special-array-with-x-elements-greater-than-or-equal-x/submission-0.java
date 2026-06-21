class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < nums.length + 1; i++) {
            int count = 0;
            for (int j : nums) {
                if (j >= i) count++;
            }
            map.put(i, count);
        }
        for (var e : map.entrySet()) {
            if (e.getKey() == e.getValue()) return e.getKey();
        }
        return -1;
    }
}