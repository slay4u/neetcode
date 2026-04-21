class Solution {
    public int minOperations(String[] logs) {
        int a = 0;
        for (String s : logs) {
            if (s.equals("./") || (s.equals("../") && a == 0)) continue;
            if (s.equals("../")) a--;
            else a++;
        }
        return a;
    }
}