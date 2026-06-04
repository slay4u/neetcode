class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(1));
        for (int i = 1; i < rowIndex + 1; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(0);
            temp.addAll(triangle.get(triangle.size() - 1));
            temp.add(0);
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < temp.size() - 1; j++) 
                row.add(temp.get(j) + temp.get(j + 1));
            triangle.add(row);
        }
        return triangle.get(rowIndex);
    }
}