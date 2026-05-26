class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : arr) 
            map.put(i, map.getOrDefault(i, 0) + 1);
        int l = -1;
        for (var entry : map.entrySet())
            if (entry.getKey() == entry.getValue()) l = entry.getKey();
        return l;
    }
}