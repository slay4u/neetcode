class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < names.length; i++)
            map.put(heights[i], names[i]);
        String[] arr = new String[names.length];
        int j = names.length - 1;
        for (var e : map.entrySet())
            arr[j--] = e.getValue();
        return arr;
    }
}