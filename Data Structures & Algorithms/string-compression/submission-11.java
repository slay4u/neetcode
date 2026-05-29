class Solution {
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int l = 0;
        while (l < chars.length) {
            s.append(chars[l]);
            int r = l + 1, count = 1;
            while (r < chars.length && chars[r] == chars[l]) {
                r++;
                count++;
            }
            if (count > 1) s.append(count);
            l = r;
        }
        for (int i = 0; i < s.length(); i++)
            chars[i] = s.charAt(i);
        return s.length();
    }
}