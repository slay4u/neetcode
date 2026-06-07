class Solution {
    public boolean isPathCrossing(String path) {
        Set<List<Integer>> set = new HashSet<>();
        int x = 0, y = 0;
        set.add(List.of(x, y));
        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'N' -> { 
                    x++;
                    if (!set.add(List.of(x, y))) return true;
                }
                case 'S' -> {
                    x--;
                    if (!set.add(List.of(x, y))) return true;
                }
                case 'E' -> {
                    y++;
                    if (!set.add(List.of(x, y))) return true;
                }
                case 'W' -> {
                    y--;
                    if (!set.add(List.of(x, y))) return true;
                }
            }
        }
        return false;
    }
}