class Solution {
    public boolean isPathCrossing(String path) {
        Set<List<Integer>> set = new HashSet<>();
        int x = 0, y = 0;
        set.add(List.of(x, y));
        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'N': x++;
                        if (!set.add(List.of(x,y))) return true;
                        break;
                case 'S': x--;
                        if (!set.add(List.of(x,y))) return true;
                        break;
                case 'E': y++;
                        if (!set.add(List.of(x,y))) return true;
                        break;
                case 'W': y--;
                        if (!set.add(List.of(x,y))) return true;
                        break;
            }
        }
        return false;
    }
}