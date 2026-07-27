class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1, area = 0;
        while (i < heights.length && j >= 0) {
            area = Math.max(area, (j - i) * Math.min(heights[i], heights[j]));
            if (heights[i] >= heights[j]) j--;
            else i++;
        }
        return area;
    }
}
