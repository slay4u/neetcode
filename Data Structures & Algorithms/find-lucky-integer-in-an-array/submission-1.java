class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : arr) 
            map.put(i, map.getOrDefault(i, 0) + 1);
        int n = -1;
        for (var e : map.entrySet())
            if (e.getKey() == e.getValue()) n = e.getKey();
        return n;
    }
}