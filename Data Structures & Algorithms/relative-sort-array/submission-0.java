class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap<>();
        int index = 0;
        for (int i : arr1)
            map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i = 0; i < arr2.length; i++) {
            while (map.get(arr2[i]) != 0) {
                arr1[index++] = arr2[i];
                map.put(arr2[i], map.get(arr2[i]) - 1);
            }
        }
        for (var e : map.entrySet()) {
            while (e.getValue() != 0) {
                arr1[index++] = e.getKey();
                map.put(e.getKey(), e.getValue() - 1);
            }
        }
        return arr1;
    }
}