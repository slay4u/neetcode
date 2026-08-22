class Solution {
    public int heightChecker(int[] heights) {
        return (int) IntStream.range(0, heights.length).filter(i -> heights[i] != Arrays.stream(heights).sorted().toArray()[i]).count();
    }
}