class Solution {
    public boolean isPathCrossing(String path) {
        Set<List<Integer>> set = new HashSet<>();
        int x = 0, y = 0;
        set.add(List.of(x, y));
        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'N' -> x++;
                case 'S' -> x--;
                case 'E' -> y++;
                case 'W' -> y--;
            }
            if (!set.add(List.of(x, y))) return true;
        }
        return false;
    }
}