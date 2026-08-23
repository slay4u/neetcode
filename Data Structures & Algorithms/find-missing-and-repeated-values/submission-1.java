class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        return ((java.util.function.Function<int[], int[]>) count -> new int[] {
                        IntStream.rangeClosed(1, grid.length * grid.length).filter(x -> count[x] == 2).findFirst().getAsInt(),
                                    IntStream.rangeClosed(1, grid.length * grid.length).filter(x -> count[x] == 0).findFirst().getAsInt()
                                            }).apply(Arrays.stream(grid).flatMapToInt(Arrays::stream)
                                                        .collect(() -> new int[grid.length * grid.length + 1], (arr, v) -> arr[v]++, (a, b) -> {}));
    }
}