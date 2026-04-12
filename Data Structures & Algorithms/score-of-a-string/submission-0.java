class Solution {
    public int scoreOfString(String s) {
        char[] t = s.toCharArray();
        int a = 0;
        for (int i = 0; i < t.length-1; i++) 
            a += Math.abs((int)t[i] - (int)t[i+1]);
        return a;
    }
}